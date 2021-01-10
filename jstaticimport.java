package Learn_Java;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.System.out;

class quadratic {
    public static void main(String[] args) {
        double a, b, c, x;

        a = 4;
        b = 1;
        c = -3;

        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution = " + x);

        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution = " + x);
    }
}

class output {
    public static void main(String[] args) {
        out.println("\n\"Now it's easy to print statements by using static import function\"\t- JavaSE-14");
    }
}