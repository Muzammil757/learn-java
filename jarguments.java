package Learn_Java;

class checkNum {
    boolean isEven(int x) { //The value in paranthesis is PARAMETER & it stores the value of arguments for initialazation!!!
        if((x % 2) == 0) return true;
        else return false;
    }
}

class jarguments {
    public static void main(String[] args) {
        checkNum e = new checkNum();

        if(e.isEven(10)) { //The value 10 stores in parameter given in its class that's called arguments
            System.out.println("10 is even.");
        }

        if (e.isEven(9)) {
            System.out.println("9 is even.");
        }

        if (e.isEven(8)) {
            System.out.println("8 is even.");
        }

        if (e.isEven(7)) {
            System.out.println("7 is even.");
        }

        if (e.isEven(6)) {
            System.out.println("6 is even.");
        }
    }
}

class factor {
    boolean isFact(int a, int b) { //This time parameters are double
        if((b % a) == 0) return true;
        else return false;
    }
}

class Checkfact {
    public static void main(String[] args) {
        factor x = new factor();

        if(x.isFact(2, 40)) System.out.println("2 is factor.");

        if(x.isFact(3, 20)) System.out.println("This won't exe.");
    }
}

class Vehicalv3 {
    int passengers;
    int feulcap;
    int mpg;

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class Vehical5 {
    public static void main(String[] args) {
       Vehicalv3 suzuki = new Vehicalv3();
       Vehicalv3 lambogini = new Vehicalv3();
       double gallons;
       int dist = 102;
       
       suzuki.passengers = 2;
       suzuki.feulcap = 6;
       suzuki.mpg = 12;

       lambogini.passengers = 4;
       lambogini.feulcap = 14;
       lambogini.mpg = 12;

       gallons = suzuki.fuelneeded(dist);

       System.out.println("To go " + dist + " miles suzuki needs " + gallons + " gallons of feul with " + suzuki.passengers + " passengers.");

       gallons = lambogini.fuelneeded(dist);

       System.out.println("To go " + dist + " miles lamborgini needs " + gallons + " gallons of feul with " + lambogini.passengers + " passengers.");
    }
}