package Learn_Java;

class joperators {
    public static void main(String[] args) {
        int n,d;
        n = 10;
        d = 2;
        if ( d != 0 && ( n % d ) == 0 ) {
            System.out.println( d + " is a factor of " + n );
        }
        
        if ( d != 0 & ( n % d ) == 0 ) {
            System.out.println( d + " is a factor of " + n );
        }
    }
}