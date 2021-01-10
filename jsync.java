package Learn_Java;

class sumarray {
    private int sum;

    synchronized int sarray(int nums[]) {
        sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(50);
            } catch(InterruptedException exc) {
                System.out.println("Error: " + exc);
            }
        }
        return sum;
    }
}

class thread7 implements Runnable {
    Thread thrd;
    static sumarray sa = new sumarray();
    int a[];
    int answer;

    thread7(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }

    public static thread7 createAndStart(String name, int nums[]) {
        thread7 t7 = new thread7(name, nums);
        t7.thrd.start();
        return t7;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting...");

        answer = sa.sarray(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " terminating...");
    }
}

class sync {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        thread7 th1 = thread7.createAndStart("Node #10", a);
        thread7 th2 = thread7.createAndStart("Node #11", a);
        try {
            th1.thrd.join();
            th2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
    }
}

class sumarray2 {
    private int sum;

    int sumarry(int nums[]) {
        sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(50);
            } catch(InterruptedException exc) {
                System.out.println("Error: " + exc);
            }
        }
        return sum;
    }
}

class thread8 implements Runnable {
    Thread thrd;
    static sumarray2 sa = new sumarray2();
    int a[];
    int answer;

    thread8(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }

    public static thread8 createAndStart(String name, int nums[]) {
        thread8 t8 = new thread8(name, nums);
        t8.thrd.start();
        return t8;
    }

    public void run() {
        System.out.println(thrd.getName() + " starting...");

        synchronized(sa) {//2nd method for sync
            answer = sa.sumarry(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating...");
    }
}

class sync2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        
        thread8 th1 = thread8.createAndStart("Node #11", a);
        thread8 th2 = thread8.createAndStart("Node #12", a);

        try {
            th1.thrd.join();
            th2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }
        System.out.println("Leaving function...");
    }
}