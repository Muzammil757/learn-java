package Learn_Java;

class jfinally {
    static void genexc(int what) {
        int t = 2;
        int nums[] = new int[2];
        System.out.print("Stage ");
        System.out.println(t);// this is just for preventing vscode unexpected error of using 't'
        System.out.println("Recieving: " + what);
        try {
            switch(what) {
                case 0:
                t = 10 / what;
                break;
                case 1:
                nums[4] = 4;
                break;
                case 2:
                return;
            }
        }
        catch(ArithmeticException exc) {
            System.out.println("Error: divide zero exc\tx000012");
            return;
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Error: Match not found\tx000013");
        }
        finally {
            System.out.println("Leaving try function...");
        }
    }
}

class finallydemo {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            jfinally.genexc(i);
            System.out.println();
        }
    }
}