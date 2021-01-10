package Learn_Java;

import java.io.*;

class jparse {
    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("How many numbers will you enter:\n>>> ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch(NumberFormatException exc) {
            System.out.println("Error: " + exc);
            n = 0;
        }
        System.out.println("Enter " + n + " values.");
        for(int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch(NumberFormatException exc) {
                System.out.println("Error: " + exc);
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average is " + avg);
    }
}