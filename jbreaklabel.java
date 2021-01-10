package Learn_Java;

class jbreaklabel {
    public static void main(String[] args) {
        int i;

        for( i = 1; i < 4; i++ ) {
        one:    {
        two:        {
        three:          {
                            System.out.println("\ni is " + i);
                            if( i == 1 ) break one;
                            if( i == 2 ) break two;
                            if( i == 3 ) break three;

                            System.out.println("This won't print.");
                        }
                        System.out.println("After block three.");
                    }
                    System.out.println("After block two.");
                }
                System.out.println("After block one.");
        }
    System.out.println("After loop(for).");
    }
}

class jbreakall {
    public static void main(String[] args) {
        done:
            for( int i = 0; i < 10; i++ ) {
                for( int j = 0; j < 10; j++ ) {
                    for( int k = 0; k < 10; k++ ) {
                    System.out.println(k + " ");
                        if( k == 7 ) {
                            break done;
                        }
                    }
                System.out.println("After K loop.");
                }
            System.out.println("After J loop.");
            }
        System.out.println("After I loop(last).");
    }
}

class afterbreak {
    public static void main(String[] args) {
        int x,y;
        stop1: for( x = 0; x < 5; x++ ) {
                for( y = 0; y < 5; y++ ) {
                    if( y== 2 ) break stop1;
                System.out.println("x and y: " + x + " " + y);
                }
        }
    System.out.println();
        for( x = 0; x < 5; x++)
        stop2: {
            for( y = 0; y < 5; y++ ) {
                if ( y == 2 ) break stop2;
            System.out.println("x and y: " + x + " " + y);
            }
        }
    }
}