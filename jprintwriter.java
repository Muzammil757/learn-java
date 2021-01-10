package Learn_Java;

import java.io.*;

class printwriterdemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.56;

        pw.println("Using PrintWriter");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " = " + (i + d));
    }
}