package Learn_Java;

abstract class twoDshape10 {
    private double width;
    private double height;
    private String name;

    twoDshape10() {
        width = height = 0.0;
        name = "none";
    }

    twoDshape10(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    twoDshape10(double x, String n) {
        width = height = x;
        name = n;
    }

    twoDshape10(twoDshape10 ob) {
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
        System.out.println("Width and height are " + width + " " + height);
    }

    abstract double area(); 
}

class triangle10 extends twoDshape10 {
    private String style;

    triangle10() {
        super();
        style = "none";
    }

    triangle10(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    triangle10(double x) {
        super(x, "triangle");
        style = "filled";
    }

    triangle10(triangle10 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getwidth() * getheight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class rectangle10 extends twoDshape10 {
    rectangle10() {
        super();
    }

    rectangle10(double w, double h) {
        super(w, h, "rectangle");
    }

    rectangle10(double x) {
        super(x, "rectangle");
    }

    rectangle10(rectangle10 ob) {
        super(ob);
    }

    boolean isSquare() {
        if(getwidth() == getheight()) return true;
        return false;
    }

    double area() {
        return getwidth() * getheight();
    }
}

class absshape {
    public static void main(String[] args) {
        twoDshape10 shapes[] = new twoDshape10[5];

        shapes[0] = new triangle10("outlined", 8.0, 12.0);
        shapes[1] = new rectangle10(10);
        shapes[2] = new rectangle10(10, 20);
        shapes[3] = new triangle10(7.0);

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getname());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}