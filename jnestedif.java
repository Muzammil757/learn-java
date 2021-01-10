package Learn_Java;

class jnestedif {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, answer = 'M';
        System.out.print("I'm thinking about a character from A to Z. Can you guess it?\n>>> ");
        ch = (char) System.in.read();
        if ( ch == answer ) {
            System.out.println("Right!");
        }
        else {
            System.out.println("Sorry you're wrong!");
            if( ch < answer ) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Too High!");
            }
        }
    }
}