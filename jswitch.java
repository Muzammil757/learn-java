package Learn_Java;

class jswitch {
    public static void main (String[] args) {
        int i;
        for( i = 0; i < 10; i++ ) {
            switch (i) {
                case 0:
                System.out.println("i is zero");
                break;
                case 1:
                System.out.println("i is one");
                break;
                case 2:
                System.out.println("i is two");
                break;
                case 3:
                System.out.println("i is three");
                break;
                case 4:
                System.out.println("i is four");
                break;
                default:
                System.out.println("i is five or more");
            }
        }
    }
}

class stringswitch {
    public static void main(String[] args) {
        String command = "cancel";

        switch(command) {
            case "connect":
            System.out.println("Connecting...");
            break;

            case "cancel":
            System.out.println("Canceling...");
            break;

            case "disconnect":
            System.out.println("Disconnecting...");
            break;

            default:
            System.out.println("Command error!");
            break;
        }
    }
}