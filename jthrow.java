package Learn_Java;

class jthrow {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw...");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            System.out.println("Exception got successfully.");
        }
        System.out.println("After try/catch block...");
    }
}

class rethrow {
    static void genExc() {
        int numer[] = {4,8,16,32,64,128,256,512};
        int denom[] = {2,0,4,4,0,8};

        for(int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            }
            catch(ArithmeticException exc) {
                System.out.println("Error: Can't handle zero\tx000008");
            }
            catch(ArrayIndexOutOfBoundsException exc) {
                System.out.println("Error: Match not found\tx000009");
                throw exc;
            }
        }
    }
}

class rethrowdemo {
    public static void main(String[] args) {
        try {
            rethrow.genExc();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Termination cause: Unknown error\tx000010");
        }
    }
}

class excdemo5 {
    static void genexc() {
        int nums[] = new int[4];
        System.out.println("Prepare for Stage 1 exception...");
        nums[7] = 100;
    }
}

class usethrowablemeths {
    public static void main(String[] args) {
        try {
            excdemo5.genexc();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace error: ");
            exc.printStackTrace();
        }
        System.out.println("Error: Unknown Exception detected\tx000011\nShutting it down...");
    }
}

class throwsdemo {
    static char prompt(String str)
    throws java.io.IOException {
        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Enter a letter");
        }
        catch(java.io.IOException exc) {
            System.out.println("I/O exception occured.");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}