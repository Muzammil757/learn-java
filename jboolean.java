package Learn_Java;

class jboolean {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if (b) {
            System.out.println("That's initiate.");
        }

        b = false;
        
        if (b) {
            System.out.println("This will not execute.");
        }

        System.out.println("10 > 9 is " + ( 10 > 9));
    }
}