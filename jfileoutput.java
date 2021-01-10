package Learn_Java;

import java.io.*;

class copyfile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length != 2) {
            System.out.println("Usage: copyfile from* to*");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                }
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Error: I/O exc: " + exc);
        } finally {
            try {
                if(fin != null) {
                    fin.close();
                }
            } catch(IOException exc) {
                System.out.println("Leaving input function...");
            }
            try {
                if(fout != null) {
                    fout.close();
                }
            } catch(IOException exc) {
                System.out.println("Leaving output function...");
            }
        }
    }
}