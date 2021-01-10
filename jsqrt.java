package Learn_Java;

class jsqrt {
    public static void main(String[] args) {
        double a,b,c;
        a = 3;
        b = 4;

        c = Math.sqrt( a*a + b*b );

        System.out.println("Hypotenuse is " + c);
    }
}

class rounderror {
    public static void main (String[] args) {
        double num, sroot, rerror;

        for ( num = 1.0; num < 100.0; num++ ) {
            sroot = Math.sqrt(num);
            System.out.println("Squar root of " + num + " is " + sroot);

            //round error detection now
            rerror = num - (sroot * sroot);
            System.out.println("Round error is " + rerror);
            System.out.println();
        }
    }
}