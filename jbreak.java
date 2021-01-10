package Learn_Java;

class jbreak {
    public static void main(String[] args) {
        int num = 100;

        for( int i = 0; i < num; i++ ) {
            if( i*i > num ) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("Loop Complete.");
    }
}

class inbreak {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch;
        for( ; ; ) {
            System.out.print("Press 's' to stop the loop\n>>> ");
            ch = (char) System.in.read();
            if ( ch == 's') {
                break;
            }
        }
        System.out.println("You pressed " + ch + ".");
    }
}