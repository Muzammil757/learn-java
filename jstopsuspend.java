package Learn_Java;

class thread10 implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    thread10(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static thread10 createAndStart(String name) {
        thread10 t10 = new thread10(name);
        t10.thrd.start();
        return t10;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting...");
        try {
            for(int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(100);
                }
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) {
                        break;
                    }
                }
            }
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println(thrd.getName() + " exiting...");
    }
    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

class suspend {
    public static void main(String[] args) {
        thread10 th10 = thread10.createAndStart("Node #12");

        try {
            Thread.sleep(1000);

            th10.mysuspend();
            System.out.println("Suspending " + th10.thrd.getName() + "...");
            Thread.sleep(1000);

            th10.myresume();
            System.out.println("Resuming " + th10.thrd.getName() + "...");
            Thread.sleep(1000);

            th10.mysuspend();
            System.out.println("Suspending " + th10.thrd.getName() + "...");
            Thread.sleep(1000);

            th10.myresume();
            System.out.println("Resuming " + th10.thrd.getName() + "...");
            Thread.sleep(1000);

            th10.mysuspend();
            System.out.println("Stopping " + th10.thrd.getName() + "...");
            th10.mystop();
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }

        try {
            th10.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println("Exiting main function...");
    }
}