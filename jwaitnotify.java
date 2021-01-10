package Learn_Java;

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if(!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");
        state = "ticked";
        notify();
        try {
            Thread.sleep(500);
            while(!state.equals("tocked"))
            wait();
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            Thread.sleep(500);
            while(!state.equals("ticked"))
            wait();
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
    }
}

class thread9 implements Runnable {
    Thread thrd;
    TickTock ttob;

    thread9(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttob = tt;
    }

    public static thread9 createAndStart(String name, TickTock tt) {
        thread9 t9 = new thread9(name, tt);
        t9.thrd.start();
        return t9;
    }

    public void run() {
        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i = 0; i < 5; i++) {
                ttob.tick(true);
            }
            ttob.tick(false);
        }
        else {
            for(int i = 0; i < 5; i++) {
                ttob.tock(true);
            }
            ttob.tock(false);
        }
    }
}

class UseTickTock {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        thread9 th1 = thread9.createAndStart("Tick", tt);
        thread9 th2 = thread9.createAndStart("Tock", tt);

        try {
            th1.thrd.join();
            th2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
    }
}