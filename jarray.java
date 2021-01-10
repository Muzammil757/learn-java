package Learn_Java;

class jarray {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for( i = 0; i < 10; i++ ) {
            sample[i] = i;
        }

        for( i = 0; i < 10; i++ ) {
            System.out.println("This is sample[" + i + "]: " + sample[i]);
        }
    }
}

class MinMax {
    public static void main(String[] args) {
        int num[] = new int[5];
        int min, max;

        num[0] = 87;
        num[1] = -65;
        num[2] = 3214;
        num[3] = -985;
        num[4] = 7;

        min = max = num[0];
        for( int i = 1; i < 5; i++ ) {
            if( num[i] < min ) {
                min = num[i];
            }

            if( num[i] > max ) {
                max = num[i];
            }
        }
        System.out.println("Min and Max => " + min + " " + max);
    }
}

class MinMaxv2 {
    public static void main(String[] args) {
        int num[] = {87,-65,3214,-985,7};
        int min, max;

        min = max = num[0];
        for( int i = 1; i < 5; i++ ) {
            if( num[i] < min ) {
                min = num[i];
            }

            if( num[i] > max ) {
                max = num[i];
            }
        }
        System.out.println("Min and Max => " + min + " " + max);
    }
}

class twoDimention {
    public static void main(String[] args) {
        int i, t;
        int table[] [] = new int[3] [4];

        for( t = 0; t < 3; ++t) {
            for( i = 0; i < 4; ++i) {
            table[t][i] = (t*4)+i+1;
            System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}

class irregularArray {
    public static void main(String[] args) {
        int riders[] [] = new int[7] [];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        int i,j;

        for( i = 0; i < 5; i++ )
            for( j = 0; j < 10; j++ )
                riders[i][j] = i + j + 10;
        for( i = 5; i < 7; i++ )
            for( j = 0; j < 2; j++ )
                riders[i][j] = i + j + 10;

        System.out.println("\nRiders per trip during the week:");
        for( i = 0; i < 5; i++ )
            for( j = 0; j < 10; j++ )
                System.out.print(riders[i][j] + " ");
        System.out.println("\n");

        System.out.println("Riders per trip on weekend: ");
        for( i = 5; i < 7; i++ ) {
            for( j = 0; j < 2; j++ )
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}

class initalizmuldim {
    public static void main(String[] args) {
        int sqrs[] [] = {
            {1,1},
            {2,4},
            {3,9},
            {4,16},
            {5,25},
            {6,36},
            {7,49},
            {8,64},
            {9,81},
            {10,100},
        };
        int i, j;
        for( i = 0; i < 10; i++ ) {
            for( j = 0; j < 2; j++ )
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }
    }
}

class arrayAssigning {
    public static void main(String[] args) {
        int i;
        int num1[] = new int[10];
        int num2[] = new int[10];

        for( i = 0; i < 10; i++ )
        num1[i] = i;

        for( i = 0; i < 10; i++ )
        num2[i] = -i;

        System.out.print("Here is num1: ");
        for( i = 0; i < 10; i++ )
        System.out.print(num1[i] + " ");
        System.out.println();

        System.out.print("Here is num2: ");
        for( i = 0; i < 10; i++ )
        System.out.print(num2[i] + " ");
        System.out.println();

        num2 = num1;

        System.out.print("Here is num2 after assignment: ");
        for( i = 0; i < 10; i++ )
        System.out.print(num2[i] + " ");
        System.out.println();

        num2[7] = 75;

        System.out.print("Here is num1 after num2 changes: ");
        for( i = 0; i < 10; i++ )
        System.out.print(num1[i] + " ");
        System.out.println();
    }
}