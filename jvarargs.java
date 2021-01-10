package Learn_Java;

class jvarargs {
    static void vatest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i =0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vatest(10);
        vatest(7,1,2);
        vatest();
    }
}

class varargs2 {
    static void vatest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vatest("One varargs: ", 77);
        vatest("Three varargs: ", 7,1,2);
        vatest("No varargs.");
    }
}

class overloadvarargs{
    static void vatest(int ... v) {
        System.out.println("vatest(int ...): Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vatest(boolean ... v) {
        System.out.println("vatest(boolean ...): Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vatest(String msg, int ... v) {
        System.out.println("vatest(String,int ...): " + msg + v.length);
        System.out.println("Contents: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" args " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vatest(1,2,3,4,5,6,7);
        vatest("Testing: ", 7,5);
        vatest(false,true,false,true);
    }
}