package Learn_Java;

import java.io.*;

class readchars {//to read characters
    public static void main(String[] args)
    throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter characters, period to quit:\n>>> ");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != '\n');
    }
}

class readlines {
    public static void main(String[] args)
    throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.print("Enter text:\n>>> ");
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("quit"));
    }
}