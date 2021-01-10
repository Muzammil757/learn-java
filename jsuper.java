package Learn_Java;

class twoDshape4 {//using 'SUPER' to call super class constructor
    private double width;
    private double height;

    twoDshape4(double w, double h) {
        width = w;
        height = h;
    }

    double getwidth() {
        return width;
    }
    double getheight() {
        return height;
    }

    void showDim() {
        System.out.println("width and height are: " + width + " and " + height);
    }
}

class triangle4 extends twoDshape4 {
    private String style;

    triangle4(String s, double w, double h) {
        super(w, h);

        style = s;
    }
    double area() {
        return getwidth() * getheight() / 2;
    }

    void showstyle() {
        System.out.println("Triangle is " + style);
    }
}

class shape4 {
    public static void main(String[] args) {
        triangle4 t1 = new triangle4("filled.", 4.0, 4.0);
        triangle4 t2 = new triangle4("outlined.", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showstyle();
        t1.showDim();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showstyle();
        t2.showDim();
        System.out.println("Area is: " + t2.area());
    }
}

class twoDshape5 {
    private double width;
    private double height;

    twoDshape5() {
        width = height = 0.0;
    }

    twoDshape5(double w, double h) {
        width = w;
        height = h;
    }

    twoDshape5 (double x) {
        width = height = x;
    }

    double getwidth() {
        return width;
    }

    double getheight() {
        return height;
    }

    void showDim() {
        System.out.println("width and height are " + width + " and " + height);
    }
}

class triangle5 extends twoDshape5 {
    private String style;

    triangle5() {
        super();
        style = "none.";
    }

    triangle5(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    triangle5(double x) {
        super(x);

        style = "filled.";
    }

    double area() {
        return getwidth() * getheight() / 2;
    }

    void showstyle() {
        System.out.println("Triangle is " + style);
    }
}

class shape5 {
    public static void main(String[] args) {
        triangle5 t1 = new triangle5();
        triangle5 t2 = new triangle5("outlined.", 10.0, 14.0);
        triangle5 t3 = new triangle5(4.0);

        t1 = t2;

        System.out.println("Info for t1: ");
        t1.showstyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showstyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showstyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
    }
}

class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass " + super.i);
        System.out.println("i in subclass " + i);
    }
}

class usesuper {
    public static void main(String[] args) {
        B subob = new B(1, 2);

        subob.show();
    }
}

class twoDshape6 {
    private double width;
    private double height;

    twoDshape6() {
        width = height = 0.0;
    }

    twoDshape6(double w, double h) {
        width = w;
        height = h;
    }

    twoDshape6 (double x) {
        width = height = x;
    }

    double getwidth() {
        return width;
    }

    double getheight() {
        return height;
    }

    void showDim() {
        System.out.println("width and height are " + width + " and " + height);
    }
}

class triangle6 extends twoDshape5 {
    private String style;

    triangle6() {
        super();
        style = "none.";
    }

    triangle6(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    triangle6(double x) {
        super(x);

        style = "filled.";
    }

    double area() {
        return getwidth() * getheight() / 2;
    }

    void showstyle() {
        System.out.println("Triangle is " + style);
    }
}

class colorTriangle extends triangle6 {
    private String color;

    colorTriangle(String c, String s, double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getcolor() {
        return color;
    }

    void showColor() {
        System.out.println("Color is " + color);
    }
}

class shape6 {
    public static void main(String[] args) {
        colorTriangle t1 = new colorTriangle("Blue", "outlined.", 8.0, 12.0);

        colorTriangle t2 = new colorTriangle("Red", "filled.", 4.0, 4.0);

        System.out.println("Info for t1: ");
        t1.showstyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println("Info for t2: ");
        t2.showstyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}

class twoDshape7 {
    private double width;
    private double height;

    twoDshape7() {
        width = height = 0.0;
    }

    twoDshape7(double w, double h) {
        width = w;
        height = h;
    }

    twoDshape7(double x) {
        width = height = x;
    }

    double getwidth() {
        return width;
    }

    double getheight() {
        return height;
    }

    void setwidth(double w) {
        width = w;
    }

    void setheight(double h) {
        height = h;
    }

    void showdim() {
        System.out.println("width & height are: " + width + " and " + height);
    }
}

class triangle7 extends twoDshape7 {
    private String style;

    triangle7() {
        super();
        style = "none.";
    }

    triangle7(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    triangle7(double x) {
        super(x);
        style = "filled.";
    }

    double area() {
        return getheight() * getwidth() / 2;
    }

    void showstyle() {
        System.out.println("Triangle is " + style);
    }
}

class colortriangle2 extends triangle7 {
    private String color;

    colortriangle2(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getcolor() {
        return color;
    }

    void showcolor() {
        System.out.println("Color is " + color);
    }
}

class shape7 {
    public static void main(String[] args) {
        colortriangle2 t1 = new colortriangle2("Blue", "outlined", 8.0, 12.0);
        colortriangle2 t2 = new colortriangle2("Red", "filled", 2.0, 2.0);

        System.out.println("Info for t1: ");
        t1.showstyle();
        t1.showdim();
        t1.showcolor();
        System.out.println("Area is " + t1.area());

        System.out.println("Info for t2: ");
        t2.showstyle();
        t2.showdim();
        t2.showcolor();
        System.out.println("Area is " + t2.area());
    }
}

class A1 {
    A1() {
        System.out.println("Constructing A");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("Constructing B");
    }
}

class C1 extends B1 {
    C1() {
        System.out.println("Constructing C");
    }
}

class orderofConstructor {
    public static void main(String[] args) {
        C1 obc = new C1();
        System.out.println(obc);//this is just for preventing error!
    }
}

class X {
    int a;
    X(int i) {
        a = i;
    }
}

class Y extends X {
    int b;
    Y(int i, int j) {
        super(j);
        b = i;
    }
}

class SupSubRef {
    public static void main(String[] args) {
        X x1 = new X(10);
        X x2;
        Y y1 = new Y(5, 6);

        x2 = x1;
        System.out.println("x2.a: " + x2.a);

        x2 = y1;
        System.out.println("x2.a: " + x2.a);

        x2.a = 19;
    //  x2.b = 27; //Error, X doesn't have a 'b' member
    }
}

class twoDshape8 {
    private double width;
    private double height;

    twoDshape8() {
        width = height = 0.0;
    }

    twoDshape8(double w, double h) {
        width = w;
        height = h;
    }

    twoDshape8(double x) {
        width = height = x;
    }

    twoDshape8(twoDshape8 ob) {
        width = ob.width;
        height = ob.height;
    }

    double getwidth() {
        return width;
    }

    double getheight() {
        return height;
    }

    void setwidth(double w) {
        width = w;
    }

    void setheight(double h) {
        height = h;
    }

    void showdim() {
        System.out.println("width & height are: " + width + " and " + height);
    }
}

class triangle8 extends twoDshape8 {
    private String style;

    triangle8() {
        super();
        style = "none.";
    }

    triangle8(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    triangle8(double x) {
        super(x);
        style = "filled.";
    }

    triangle8(triangle8 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getheight() * getwidth() / 2;
    }

    void showstyle() {
        System.out.println("Triangle is " + style);
    }
}

class shape8 {
    public static void main(String[] args) {
        triangle8 t1 = new triangle8("outlined", 8.0, 12.0);
        triangle8 t2 = new triangle8(t1);

        System.out.println("Info for t1: ");
        t1.showstyle();
        t1.showdim();
        System.out.println("Area is " + t1.area());

        System.out.println("Info for t2: ");
        t2.showstyle();
        t2.showdim();
        System.out.println("Area is " + t2.area());
    }
}

class twoDshape9 {
    private double width;
    private double height;
    private String name;

    twoDshape9() {
        width = height = 0.0;
        name = "none";
    }

    twoDshape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    twoDshape9(double x, String n) {
        width = height = x;
        name = n;
    }

    twoDshape9(twoDshape9 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getwidth() {
        return width;
    }

    double getheight() {
        return height;
    }

    String getname() {
        return name;
    }

    void showDim() {
        System.out.println("width and height are: " + width + " " + height);
    }

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

class triangle9 extends twoDshape9 {
    private String style;

    triangle9() {
        super();
        style = "none";
    }

    triangle9(double w, double h, String s) {
        super(w, h, "tryangle");
        style = s;
    }

    triangle9(double x) {
        super(x, "triangle");
        style = "filled";
    }

    triangle9(triangle9 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getwidth() * getheight() / 2;
    }

    void showstyle() {
        System.out.println("Triangle is " + style);
    }
}

class dynShape {
    public static void main(String[] args) {
        twoDshape9 shapes[] = new twoDshape9[3];

        shapes[0] = new triangle9(8.0, 12.0, "outlyned");
        shapes[1] = new  triangle9(7.0);
        shapes[2] = new twoDshape9(10, 20, "generic");

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getname());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}