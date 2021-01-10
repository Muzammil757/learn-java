package Learn_Java;

class weight {
    public static void main(String[] args) {
        double w,m,m2,g1,g2;
        w = 55;
        g1 = 9.8;
        g2 = 1.7;
        m = w/g1;
        m2 = m*g2;

        System.out.println("\nMy weight at earth is " + w + " and that of moon my weight will be " + m2 + ".");
    }
}

class prime {
    public static void main(String[] args) {
        int i,j;
        boolean p;

        for( i = 2; i < 100; i++ ) {
            p = true;

            for( j = 2; j <= i/j; j++ )
            if( (i%j) == 0 ) p = false;

            if(p)
            System.out.println( i + " is prime.");
        }
    }
}