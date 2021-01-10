package Learn_Java;

class jtrycatch {
    public static void main(String[] args) {
        int nums[] = new int[4];
        try {
            System.out.println("Before exception is generated!");
            nums[7] = 10;
            System.out.println("This wouldn't display...");
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index-out-of-bounds");
        }
        System.out.println("After catch statement.");
    }
}

class exctest {
    static void genexc() {
        int nums[] = new int[5];
        System.out.println("Prepare for generation exc...");
        nums[7] = 10;
        System.out.println(nums[7]);
    }
}

class excdemo {
    public static void main(String[] args) {
        try {
            exctest.genexc();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("\nWe're sorry.\n\t\t\t\tError:Index-Out-Of-Bounds x000000\n");
        }
        System.out.println("Generation Exception faliure...\n\nDon't press any key...");
    }
}

class excdemo1 {
    public static void main(String[] args) {
        int numer[] = {4,8,16,32,64,128};
        int denom[] = {2,0,4,8,0,8};

        for(int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            }
            catch(ArithmeticException exc) {
                System.out.println("Error: Can't divide by zero\tx000001");
            }
        }
    }
}

class excdemo2 {
    public static void main(String[] args) {
        int numer[] = {4,8,16,32,64,128,256,512};
        int denom[] = {2,0,4,8,0,8};

        for(int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            }
            catch(ArithmeticException exc) {
                System.out.println("Error: Can't divide by zero\tx000002");
            }
            catch(ArrayIndexOutOfBoundsException exc) {
                System.out.println("Error: Match not found\tx000003");
            }
        }
    }
}

class excdemo3 {
    public static void main(String[] args) {
        int numer[] = {4,8,16,32,64,128,256,512};
        int denom[] = {2,0,4,8,0,8};

        for(int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            }
            catch(ArrayIndexOutOfBoundsException exc) {
                System.out.println("Error: Match not found\tx000004");
            }
            catch(Throwable exc) {
                System.out.println("Error: Exception type not found\tx000005");
            }
        }
    }
}

class excdemo4 {
    public static void main(String[] args) {
        int numer[] = {4,8,16,32,64,128,256,512};
        int denom[] = {2,0,4,8,0,8};

        try {
            for(int i = 0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
                }
                catch(ArithmeticException exc) {
                    System.out.println("Error: Exc type divide by zero\tx000006");
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Error: Unknown match exc\tx000007\nTermination cause: Fatal error detected...");
        }
    }
}

class multicatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result = 0;
        System.out.println(result);//just to prevent error
        char chrs[] = {'A','B','C'};

        for(int i = 0; i < 2; i++) {
            try {
                if(i == 0) {
                    result = a / b;
                }
                else {
                    chrs[5] = 'X';
                }
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
            }
        }
        System.out.println("Leaving Exceptions...");
    }
}