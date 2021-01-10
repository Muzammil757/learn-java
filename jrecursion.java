package Learn_Java;

class jrecursion {
    int facR(int n) {
        int result;

        if(n == 1) return 1;
        result = facR(n - 1) * n;
        return result;
    }

    //This is iterative meth
    int facI(int n) {
        int t, result;

        result = 1;
        for(t = 1; t <= n; t++) {
            result *= t;
        }
        return result;
    }
}

class resursiondemo {
    public static void main(String[] args) {
        jrecursion r = new jrecursion();

        System.out.println("Factorial using recusive method.");
        System.out.println("Factorial of 3 is: " + r.facR(3));
        System.out.println("Factorial of 4 is: " + r.facR(4));
        System.out.println("Factorial of 5 is: " + r.facR(5));
        System.out.println("Factorial of 1 is: " + r.facR(1));
        System.out.println();

        System.out.println("Factorial using iterative method.");
        System.out.println("Factorial of 3 is: " + r.facI(3));
        System.out.println("Factorial of 4 is: " + r.facI(4));
        System.out.println("Factorial of 5 is: " + r.facI(5));
        System.out.println("Factorial of 1 is: " + r.facI(1));
    }
}