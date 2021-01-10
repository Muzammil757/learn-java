package Learn_Java;

class jif {
    public static void main(String[] agrs)
    throws java.io.IOException {
        char ch, answer = 'M';
        System.out.print("I'm thinking about a character between A to Z.\nCan you guess it?\n>>> ");
        ch = (char) System.in.read();
        if( ch == answer ) {
            System.out.println("*****Right*****");
        }
        else {
            System.out.println("Sorry you're absolutly wrong.");
        }
    }
}