package Learn_Java;
//It's all about inheritence.
class twoDshape {
    double width, height;

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

class triangle extends twoDshape {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class rectangle extends twoDshape {
    boolean isSquare() {
        if(width == height) return true;
        return false;
    }

    double area() {
        return width *height / 2;
    }
}

class shapesdemo {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        triangle t2 = new triangle();
        rectangle r1 = new rectangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled.";

        t2.width = 7.0;
        t2.height = 14.0;
        t2.style = "outlined.";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for r1: ");
        r1.width = 6.0;
        r1.height = 6.0;
        r1.showDim();
        System.out.println("Shape is square: " + r1.isSquare());
        System.out.println("Area is " + r1.area());
    }
}

class twoDshape2 {
    private double width;
    private double height;

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

    void showDim() {
        System.out.println("width and height are: " + width + " and " + height);
    }
}

class triangle2 extends twoDshape2 {
    String style;

    double area() {
        return getwidth() * getheight() / 2;
    }

    void showstyle() {
        System.out.println("Triangle is " + style);
    }
}

class shape2 {
    public static void main(String[] args) {
        triangle2 t1 = new triangle2();
        triangle2 t2 = new triangle2();
        
        t1.setwidth(4.0);
        t1.setheight(4.0);
        t1.style = "filled";

        t2.setwidth(8.0);
        t2.setheight(12.0);
        t2.style = "outlined";

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

class twoDshape3 {//using constructors in inheritence
    private double width;
    private double height;

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

    void showDim() {
        System.out.println("width and height are: " + width + " and " + height);
    }
}

class triangle3 extends twoDshape3 {
    private String style;

    triangle3(String s, double w, double h) {
        setwidth(w);
        setheight(h);
        style = s;
    }
    double area() {
        return getwidth() * getheight() / 2;
    }

    void showstyle() {
        System.out.println("Triangle is " + style);
    }
}

class shape3 {
    public static void main(String[] args) {
        triangle3 t1 = new triangle3("filled.", 4.0, 4.0);
        triangle3 t2 = new triangle3("outlined.", 8.0, 12.0);

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