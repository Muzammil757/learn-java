package Learn_Java;

class jwhile {
    public static void main(String[] args) {
        char ch;
        ch = 'A';
        while ( ch <= 'Z' ) {
            System.out.print(ch + " ");
            if ( ch == 'Z' ) {
                System.out.print("\b.");
            }
            ch++;
        }
    }
}

class power {
    public static void main(String[] args) {
        int e, result;
        for ( int i = 0; i < 10; i++ ) {
            result = 1;
            e = i;

            while ( e > 0 ) {
                result *= 2;
                e--;
            }
            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}