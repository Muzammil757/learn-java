package Learn_Java;

//usage java Showfile test.txt

import java.io.*;

class Showfile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if(args.length != 1) {
            System.out.println("Usage: Showfile file*");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException exc) {
            System.out.println("Error: File not found");
            return;
        }

        try {
            do {
                i = fin.read();
                if(i != -1) {
                    System.out.print((char) i);
                }
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Error: Couldn't read file...");
        }

        try {
            fin.close();
        } catch(IOException exc) {
            System.out.println("Error: Couldn't close file...");
        }
    }
}

class Showfile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if(args.length != 1) {
            System.out.println("Usage: Showfile file*");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) {
                    System.out.print((char) i);
                }
            } while(i != -1);
        } catch(FileNotFoundException exc) {
            System.out.println("Error: File not found");
        } catch (IOException exc) {
            System.out.println("Error: Couldn't read");
        }

        finally {
            try {
                if(fin != null) {
                    fin.close();
                }
            } catch(IOException exc) {
                System.out.println("Error: Closing file...");
            }
        }
    }
}