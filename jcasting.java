package Learn_Java;

class jcasting {
    public static void main(String[] args) {
        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) ( x / y );
        System.out.println("Integer outcome of x/y is: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b is " + b);

        b = 87;
        ch = (char) b;
        System.out.println("Value of ch is " + ch);
    }
}