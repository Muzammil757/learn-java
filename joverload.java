package Learn_Java;

class joverload {
    void ovl() {
        System.out.println("No parameters.");
    }

    void ovl(int a) {
        System.out.println("One paramter " + a + ".");
    }

    int ovl(int a, int b) {
        System.out.println("Two parameters " + a + ", " + b + ".");
        return a + b;
    }

    double ovl(double a, double b) {
        System.out.println("Two double parameters " + a + ", " + b + ".");
        return a+ b;
    }
}

class ovldemo {
    public static void main(String[] args) {
        joverload ob = new joverload();
        int resI;
        double resD;

        ob.ovl();
        System.out.println();

        ob.ovl(2);
        System.out.println();

        resI = ob.ovl(4, 5);
        System.out.println("Result of ob.ovl(4,5): " + resI);
        System.out.println();

        resD = ob.ovl(4.6, 7.1);
        System.out.println("Result of ob.ovl(4.6,7.1): " + resD);
        System.out.println();
    }
}

class typecvt {
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}

class typecvtdemo {
    public static void main(String[] args) {
        typecvt ob = new typecvt();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 12;
        float f = 12.5F;

        ob.f(i);
        ob.f(d);

        ob.f(b);
        ob.f(s);
        ob.f(f);
    }
}

class overcons {
    int x;

    overcons() {
        System.out.println("Inside overcons.");
        x = 0;
    }

    overcons(int i) {
        System.out.println("Inside over int.");
        x = i;
    }

    overcons(double d) {
        System.out.println("Inside over double.");
        x = (int) d;
    }

    overcons(int i, int j) {
        System.out.println("Inside over int int.");
        x = i * j;
    }
}

class overconsdemo {
    public static void main(String[] args) {
        overcons t1 = new overcons();
        overcons t2 = new overcons(99);
        overcons t3 = new overcons(55.88);
        overcons t4 = new overcons(3, 7);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}

class overSum {
    int sum;

    overSum(int num) {
        sum = 0;
        for(int i = 1; i <= num; i++)
        sum += i;
    }

    overSum(overSum ob) {
        sum = ob.sum;
    }
}

class sumdemo {
    public static void main(String[] args) {
        overSum s1 = new overSum(7);
        overSum s2 = new overSum(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}