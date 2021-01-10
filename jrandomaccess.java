package Learn_Java;

import java.io.*;

class randomaccessdemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.56, 33.0, 87.38, 74.58};
        double d;

        try(RandomAccessFile raf = new RandomAccessFile("rand.dat", "rw")) {
            System.out.print("Writing data...");
            for(int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
                System.out.print(".");
            }

            raf.seek(0);
            System.out.println("\nSeeking value...");
            d = raf.readDouble();
            System.out.println("Reading data...");
            System.out.println("First value is " + d);

            raf.seek(8);//it's because each value in double is 8-byte long and each value starts on 8-byte boundary thus to seek 2nd value we use 8-byte sequence 8-16-24 and so on...
            System.out.println("Seeking value...");
            d = raf.readDouble();
            System.out.println("Reading data...");
            System.out.println("Second value is " + d);

            raf.seek(8*3);
            System.out.println("Seeking value...");
            d = raf.readDouble();
            System.out.println("Reading data...");
            System.out.println("Fourth value is " + d + "\n");

            System.out.println("Here is rest of values: ");
            for(int i = 0; i < data.length; i += 2) {
                raf.seek(8*i);
                System.out.println("Seeking value...");
                d = raf.readDouble();
                System.out.println("Reading data...");
                System.out.println(d + " ");
            }
        } catch(IOException exc) {
            System.out.println("Error: " + exc);
        }
    }
}