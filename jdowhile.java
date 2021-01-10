package Learn_Java;

class jdowhile {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch;
        do {
            System.out.print("Press a key followed by Enter:\n>>> ");
            ch = (char) System.in.read();
        }while( ch != 's');
    }
}

class game {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, ignore, answer = 'M';

        do {
            System.out.print("I'm thinking about a character between A to Z. Can you guess it?\n>>> ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while( ignore != '\n');

            if ( ch ==  answer ) {
                System.out.println("Ultimately Right!");
            }
            else {
                System.out.print("Sorry you're");
                if( ch < answer ) System.out.println(" too low.");
                else System.out.println(" Too high");
                System.out.println("Try again!");
            }
        }while( answer != ch );
    }
}