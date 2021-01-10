package Learn_Java;

import java.io.*;

class jinRead {
    public static void main(String[] args)
    throws IOException{
        char ch;
        System.out.print("Press a key followed by Enter:\n>>> ");
        ch = (char) System.in.read();
        System.out.println("Your key is " + ch);
    }
}