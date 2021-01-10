package Learn_Java;

import java.io.*;

class filewritedemo {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try(FileWriter fw = new FileWriter("test2.txt")) {
            do {
                System.out.print("Enter text(stop to quit):\n>>> ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;

                str = str + "\n";
                fw.write(str);
            } while(str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("Error: " + exc);
        }
    }
}