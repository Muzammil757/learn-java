package Learn_Java;

enum Transport {
    Car, Truck, Airplane, Train, Boat
}

class enumdemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.Airplane;

        System.out.println("Value of tp: " + tp);

        tp = Transport.Train;

        if(tp == Transport.Train) {
            System.out.println("tp contains Train");
        }

        switch(tp) {
            case Car:
            System.out.println("A Car caries people");
            break;

            case Truck:
            System.out.println("A Truck carries freight");
            break;

            case Airplane:
            System.out.println("An Airplane flies");
            break;

            case Train:
            System.out.println("A Train runs on rails");
            break;

            case Boat:
            System.out.println("A Boat sails in water");
            break;
        }
    }
}

class enumdemo2 {
    public static void main(String[] args) {
        Transport tp;
        
        System.out.println("Here're entire Transport constants:");

        Transport allTransports[] = Transport.values();
        for(Transport t: allTransports)
        System.out.println(t);
        System.out.println();

        tp = Transport.valueOf("Airplane");
        System.out.println("tp contains " + tp);
    }
}

enum Transport1 {
    Car(120), Truck(80), Airplane(3000), Train(160), Boat(56);

    private int speed;

    Transport1(int s) {
        speed = s;
    }
    int getspeed() {
        return speed;
    }
}

class enumdemo3 {
    public static void main(String[] args) {
        System.out.println("Typical speed for an airplane is " + Transport1.Airplane.getspeed() + " kilometer per hour.");
        System.out.println("All Transport speeds: ");
        for(Transport1 t : Transport1.values())
        System.out.println(t + " typical speed is " + t.getspeed() + " kilometer per hour.");
    }
}

class enumdemo4 {
    public static void main(String[] args) {
        Transport tp1, tp2, tp3;
        System.out.println("Here're entire transport constants and their ordinal values: ");
        for(Transport t : Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }
        tp1 = Transport.Airplane;
        tp2 = Transport.Train;
        tp3 = Transport.Airplane;

        System.out.println();

        if(tp1.compareTo(tp2) < 0) {
            System.out.println(tp1 + " comes before " + tp2);
        }
        if(tp1.compareTo(tp2) > 0) {
            System.out.println(tp2 + " comes before " + tp1);
        }
        if(tp1.compareTo(tp3) == 0) {
            System.out.println(tp1 + " equals " + tp3);
        }
    }
}