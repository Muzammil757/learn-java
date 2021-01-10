package Learn_Java;

class jfor {
    public static void main(String[] args) {
        int count;

        for( count = 0; count < 5; count++) {
            System.out.println("Count is at " + count);
        }

        System.out.println("Done");
    }
}

class converter {
    public static void main(String[] args) {
        int counter, gallons;
        double liter;

        counter = 0;

        for( gallons = 1; gallons <= 100; gallons++) {
            liter = gallons * 3.75;
            if( gallons == 1) {
            System.out.println(gallons + " gallon is " + liter + " liters.");
            }
            else {
                System.out.println(gallons + " gallons is " + liter + " liters.");
            }

            counter++;
            if ( counter == 10 ) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

class comma {
    public static void main(String[] args) {
        int i,j;
        for( i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i and j: " + i + " " + j);
        }
    }
}

class forStop {
    public static void main(String[] args)
    throws java.io.IOException {
        int i;
        System.out.println("\nPress S to stop!");
        for( i = 0; (char) System.in.read() != 'S'; i++ ) {
            System.out.println("Pass #" + i);
        }
    }
}

class controlVar {
    public static void main(String[] args) {
        int sum = 0, fact = 1;

        for ( int i = 1; i <= 5; i++ ) {
            sum += i; //This will sum all the values to sum var
            fact *= i; //This will multiply all values to fact var
        }
        
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}

class nestedfor {
    public static void main(String[] args) {
        for( int i = 2; i <= 100; i++ ) {
            System.out.print("Factors of " + i + ": ");
            for( int j = 2; j < i; j++ ) {
                if(( i % j ) == 0 ) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}