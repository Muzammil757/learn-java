package Learn_Java.jProjects;

class Usemain {
    public static void main(String[] args) {
        Thread thrd;
        thrd = Thread.currentThread();
        
        System.out.println("\nMain Thread is " + thrd.getName());
        System.out.println("Priority " + thrd.getPriority());
        System.out.println();

        System.out.println("Setting:\n\tName & Priority");
        try {
            for(int i = 0; i < 30; i++) {
                System.out.print(".");
                Thread.sleep(200);
            }
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }

        thrd.setName("Node #13");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("\n\nMain Thread is now " + thrd.getName());
        System.out.println("Priority " + thrd.getPriority());
    }
}