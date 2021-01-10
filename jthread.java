package Learn_Java;

class jthread implements Runnable {
    String thrdname;
    jthread(String name) {
        thrdname = name;
    }

    public void run() {
        System.out.println(thrdname + " starting...");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdname + " count is " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrdname + " Interrupted: " + exc);
        }
        System.out.println(thrdname + " terminating...");
    }
}

class Usethread {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");
        jthread jt = new jthread("Node #1");
        Thread newthrd = new Thread(jt);
        newthrd.start();

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("\nLeaving main thread...");
    }
}

class thread2 implements Runnable {
    Thread thrd;

    thread2(String name) {
        thrd = new Thread(this, name);
    }

    public static thread2 createAndStart(String name) {
        thread2 myth = new thread2(name);
        myth.thrd.start();
        return myth;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting...");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " count is " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println("Exc: " + exc);
        }
        System.out.println(thrd.getName() + " terminating...");
    }
}

class Usethread2 {
    public static void main(String[] args) {
        System.out.println("Main thread starting...");
        thread2 m2 = thread2.createAndStart("Node #2");
        System.out.println(m2);//just for prevening error...
        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Error: " + exc);
            }
        }
        System.out.println("\nExiting main thread...");
    }
}

class thread3 extends Thread {
    thread3(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " is preparing for starting function...");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("Prepare for Unpacking " + getName() + " at " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println(getName() + " terminating it's functions...");
    }
}

class Usethread3 {
    public static void main(String[] args) {
        System.out.println("Main function starting threads...");
        thread3 t3 = new thread3("Node #3");
        t3.start();

        for(int i = 0; i < 70; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Error: " + exc);
            }
        }
        System.out.println("\nExiting thread function...");
    }
}

class thread4 implements Runnable {
    Thread thrd;

    thread4(String name) {
        thrd = new Thread(this, name);
    }
    
    public static thread4 createAndStart(String name) {
        thread4 t4 = new thread4(name);
        t4.thrd.start();
        return t4;
    }

    public void run() {
        System.out.println(thrd.getName() + " is preparing for starting function...");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("Prepare for Unpacking " + thrd.getName() + " at " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println(thrd.getName() + " terminating it's functions...");
    }
}

class Usethread4 {
    public static void main(String[] args) {
        System.out.println("Main functions activating...");

        thread4 th4 = thread4.createAndStart("Node #4");
        thread4 th5 = thread4.createAndStart("Node #5");
        thread4 th6 = thread4.createAndStart("Node #6");
        System.out.println(th4);
        System.out.println(th5);
        System.out.println(th6);
        //above three lines are just for the sake of preventing error...

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Error: " + exc);
            }
        }
        System.out.println("\nTerminating functions...");
    }
}

class thread5isAlive implements Runnable {
    Thread thrd;

    thread5isAlive(String name) {
        thrd = new Thread(this, name);
    }
    
    public static thread5isAlive createAndStart(String name) {
        thread5isAlive t5 = new thread5isAlive(name);
        t5.thrd.start();
        return t5;
    }

    public void run() {
        System.out.println(thrd.getName() + " is preparing for starting function...");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("Prepare for Unpacking " + thrd.getName() + " at " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println(thrd.getName() + " terminating it's functions...");
    }
}

class Usethread5 {
    public static void main(String[] args) {
        System.out.println("Main functions activating...");

        thread5isAlive th4 = thread5isAlive.createAndStart("Node #4");
        thread5isAlive th5 = thread5isAlive.createAndStart("Node #5");
        thread5isAlive th6 = thread5isAlive.createAndStart("Node #6");
        System.out.println(th4);
        System.out.println(th5);
        System.out.println(th6);
        //above three lines are just for the sake of preventing error...

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Error: " + exc);
            }
        } while(th4.thrd.isAlive() || th5.thrd.isAlive() || th6.thrd.isAlive());
        System.out.println("\nTerminating functions...");
    }
}

class thread6join implements Runnable {
    Thread thrd;
    thread6join(String name) {
        thrd = new Thread(this, name);
    }

    public static thread6join createAndStart(String name) {
        thread6join t6 = new thread6join(name);
        t6.thrd.start();
        return t6;
    }

    public void run() {
        System.out.println(thrd.getName() + " is preparing for starting function...");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("Prepare for Unpacking " + thrd.getName() + " at " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println(thrd.getName() + " terminating it's functions...");
    }
}

class Usethread6 {
    public static void main(String[] args) {
        System.out.println("Activating main functions...");

        thread6join th1 = thread6join.createAndStart("Node #6");
        thread6join th2 = thread6join.createAndStart("Node #7");
        thread6join th3 = thread6join.createAndStart("Node #8");

        try {
            th1.thrd.join();
            System.out.println("Node #6 joined");
            th2.thrd.join();
            System.out.println("Node #7 joined");
            th3.thrd.join();
            System.out.println("Node #8 joined");
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println("Exiting main function...");
    }
}

class priority implements Runnable {
    int count;
    Thread thrd;

    static Boolean stop = false;
    static String currentName;

    priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting...");
        do {
            count++;

            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 10000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " terminating...");
    }
}

class prioritydemo {
    public static void main(String[] args) {
        priority p1 = new priority("High priority");
        priority p2 = new priority("Low priority");
        priority p3 = new priority("Normal priority #1");
        priority p4 = new priority("Normal priority #2");

        p1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        p2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        p1.thrd.start();
        p2.thrd.start();
        p3.thrd.start();
        p4.thrd.start();

        try {
            p1.thrd.join();
            p2.thrd.join();
            p3.thrd.join();
            p4.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println("\nHigh priority thread counted to " + p1.count);
        System.out.println("\nLow priority thread counted to " + p2.count);
        System.out.println("\nNormal priority #1 thread counted to " + p3.count);
        System.out.println("\nNormal priority #2 thread counted to " + p4.count);
    }
}