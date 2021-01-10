package Learn_Java;

import java.io.*;

class showfile3 {
    public static void main(String[] args) {
        int i;

        if(args.length != 1) {
            System.out.println("Usage: showfile3 <file>");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if(i != -1) {
                    System.out.print((char) i);
                }
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Exc: " + exc);
        }
    }
}

class copyfile2 {
    public static void main(String[] args)
    throws IOException {
        int i;

        if(args.length != 2) {
            System.out.println("Usage: copyfile2 <from> <to>");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                }
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Exc: " + exc);
        }
    }
}

class RWdata {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.95;
        boolean b = true;

        try(DataOutputStream dataout = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Writing..." + i);
            dataout.writeInt(i);

            System.out.println("Writing..." + d);
            dataout.writeDouble(d);

            System.out.println("Writing..." + b);
            dataout.writeBoolean(b);

            System.out.println("Writing..." + 12.2 * 7.4);
            dataout.writeDouble(12.2 * 7.4);
        } catch(IOException exc) {
            System.out.println("Write error...");
            return;
        }

        System.out.println();

        try(DataInputStream datain = new DataInputStream(new FileInputStream("testdata"))) {
            i = datain.readInt();
            System.out.println("Reading..." + i);

            d = datain.readDouble();
            System.out.println("Reading..." + d);

            b = datain.readBoolean();
            System.out.println("Reading..." + b);

            d = datain.readDouble();
            System.out.println("Reading..." + d);
        } catch(IOException exc) {
            System.out.println("Read error...");
        }
    }
}

class comparison {
    public static void main(String[] args) {
        int i, j;

        if(args.length != 2) {
            System.out.println("Usage: comparison <F1> <F2>");
            return;
        }

        try(FileInputStream f1 = new FileInputStream(args[0]); FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                j = f2.read();
                System.out.println("Feeding data...");
                if(i != j) {
                    break;
                }
            } while(i != -1 && j != -1);

            if(i != j) {
                System.out.println("Files were different!");
            } else {
                System.out.println("Files are same.");
            }
        } catch(IOException exc) {
            System.out.println("Error: " + exc);
        }
    }
}