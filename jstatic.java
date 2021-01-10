package Learn_Java;

class jstatic {
    int x;
    static int y;

    int sum() {
        return x + y;
    }
}

class staticdemo {
    public static void main(String[] args) {
        jstatic ob1 = new jstatic();
        jstatic ob2 = new jstatic();

        ob1.x = 10;
        ob2.x = 20;

        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        jstatic.y = 19;
        System.out.println("Static variable y is shared.");
        System.out.println("Value of static var y: " + jstatic.y);

        System.out.println("Sum of ob1: " + ob1.sum());
        System.out.println("Sum of ob2: " + ob2.sum());
        System.out.println();

        jstatic.y = 7;
        System.out.println("Sum of ob1 after modification: " + ob1.sum());
        System.out.println("Sum of ob2 afer modification: " + ob2.sum());
    }
}

class staticmeth {
    static int val = 1024;

    static int valdiv() {
        return val / 2;
    }
}

class staticmethdemo {
    public static void main(String[] args) {
        System.out.println("Val is: " + staticmeth.val);
        System.out.println("Static method: " + staticmeth.valdiv());
    }
}

class StaticBlock {
    static double rootof2;
    static double rootof3;
    String str = "For the sake of ob to prevent error!";

    static {
        System.out.println("Inside the static block.");
        rootof2 = Math.sqrt(2.0);
        rootof3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class staticblockdemo {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside Constructor.");
        System.out.println(ob.str);

        System.out.println("Square root of 2 is: " + StaticBlock.rootof2);
        System.out.println("Square root of 3 is: " + StaticBlock.rootof3);
    }
}