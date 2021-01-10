package Learn_Java.jProjects;

class Vehicalv2 {
    int passengers;
    int feulcap;
    int mpg;

    int range() {
        return feulcap * mpg;
    }
}

class Vehical1 {
    public static void main(String[] args) {
       Vehicalv2 suzuki = new Vehicalv2();
       int range;
       
       suzuki.passengers = 2;
       suzuki.feulcap = 6;
       suzuki.mpg = 12;

       range = suzuki.feulcap * suzuki.mpg;
       System.out.println("\nSUZUKI can carry " + suzuki.passengers + " passengers with a range of " + range + ".");
    }
}

class Vehical2 {
    public static void main(String[] args) {
       Vehicalv2 suzuki = new Vehicalv2();
       Vehicalv2 lambogini = new Vehicalv2();
       int range1, range2;
       
       suzuki.passengers = 2;
       suzuki.feulcap = 6;
       suzuki.mpg = 12;

       lambogini.passengers = 4;
       lambogini.feulcap = 14;
       lambogini.mpg = 12;

       range1 = suzuki.feulcap * suzuki.mpg;
       range2 = lambogini.feulcap * lambogini.mpg;
       System.out.println("\nSUZUKI can carry " + suzuki.passengers + " passengers with a range of " + range1 + ".");
       System.out.println("\nLamborgini can carry " + lambogini.passengers + " passengers with a range of " + range2 + ".");
    }
}

class Vehical3 {
    public static void main(String[] args) {
       Vehicalv2 suzuki = new Vehicalv2();
       Vehicalv2 lambogini = new Vehicalv2();
       
       suzuki.passengers = 2;
       suzuki.feulcap = 6;
       suzuki.mpg = 12;

       lambogini.passengers = 4;
       lambogini.feulcap = 14;
       lambogini.mpg = 12;

       System.out.println("\nSUZUKI can carry " + suzuki.passengers + " passengers.");
       suzuki.range();
       System.out.println("\nLamborgini can carry " + lambogini.passengers + " passengers.");
       lambogini.range();
    }
}

class Vehical4 {
    public static void main(String[] args) {
       Vehicalv2 suzuki = new Vehicalv2();
       Vehicalv2 lambogini = new Vehicalv2();
       
       suzuki.passengers = 2;
       suzuki.feulcap = 6;
       suzuki.mpg = 12;

       lambogini.passengers = 4;
       lambogini.feulcap = 14;
       lambogini.mpg = 12;

       System.out.println("\nSUZUKI can carry " + suzuki.passengers + " passengers with a range of " + suzuki.range() + " miles.");
       System.out.println("\nLamborgini can carry " + lambogini.passengers + " passengers with a range of " + lambogini.range() + " miles.");
    }
}

class Vehicalv6 {
    int passengers, feulcap, mpg;

    Vehicalv6(int p, int f, int m) {
        passengers = p;
        feulcap = f;
        mpg = m;
    }

    int range() {
        return mpg * feulcap;
    }

    double feulneeded(int miles) {
        return miles / mpg;
    }
}

class Vehical6 {
    public static void main(String[] args) {
        Vehicalv6 suzuki = new Vehicalv6(2, 6, 12);
        Vehicalv6 sportscar = new Vehicalv6(4, 12, 21);
        double gallons;
        int dist = 70;

        gallons = suzuki.feulneeded(dist);
        System.out.println("To go " + dist + " miles Suzuki needs " + gallons + " gallons of feul.");

        gallons = sportscar.feulneeded(dist);
        System.out.println("To go " + dist + " miles Sportscar needs " + gallons + " gallons of feul.");
    }
}

class Vehical7 {
    private int passengers;
    private int feulcap;
    private int mpg;

    Vehical7(int p, int f, int m) {
        passengers = p;
        feulcap = f;
        mpg = m;
    }

    int range() {
        return mpg * feulcap;
    }

    double feulneeded(int miles) {
        return (double) miles / mpg;
    }

    int getpassengers() {
        return passengers;
    }

    void setpassengers(int p) {
        passengers = p;
    }

    int getfeulcap() {
        return feulcap;
    }

    void setfeulcap(int f) {
        feulcap = f;
    }

    int getmpg() {
        return mpg;
    }

    void setmpg(int m) {
        mpg = m;
    }
}

class truck extends Vehical7 {
    private int cargocap;

    truck(int p, int f, int m, int c) {
        super(p, f, m);

        cargocap = c;
    }

    int getcargo() {
        return cargocap;
    }

    void putcargo(int c) {
        cargocap = c;
    }
}

class truckdemo {
    public static void main(String[] args) {
        truck semi = new truck(2, 200, 7, 44000);
        truck pickup = new truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.feulneeded(dist);

        System.out.println("Semi can carry " + semi.getcargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of feul.\n");

        gallons = pickup.feulneeded(dist);

        System.out.println("Pickup can carry " + pickup.getcargo() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of feul.");
    }
}