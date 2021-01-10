package Learn_Java;

import java.io.*;

class filereaderdemo {
    public static void main(String[] args) {
        String s;

        try(BufferedReader br = new BufferedReader(new FileReader("test2.txt"))) {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("Error: " + exc);
        }
    }
}

class filereaderdemo1 {
    public static void main(String[] args) {
        int s;
        for(int i = 0; i <= 10; i++) {
            try(BufferedReader br = new BufferedReader(new FileReader("test3.txt"))) {
                while((s = br.read()) != -1) {
                    System.out.print((char) s);
                    Thread.sleep(20);
                }
            } catch(IOException | InterruptedException exc) {
                System.out.println("Error: " + exc);
            }
        }
    }
}