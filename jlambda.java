package Learn_Java;

import java.io.*;

interface myvalue {
    double getvalue();
}

interface paravalue {
    double getvalue(double v);
}

class lambdademo {
    public static void main(String[] args) {
        myvalue myval;
        myval = () -> 98.6;
        System.out.println("A constant value: " + myval.getvalue());

        paravalue mypara = (n) -> 1.0 / n;
        System.out.println("Reciprocal of 4 is: " + mypara.getvalue(4.0));
        System.out.println("Reciprocal of 8 is: " + mypara.getvalue(8.0));

        // myval = () -> "One"; //error bcz string isn't compatible with double val
    }
}

interface numerictest {
    boolean test(int n, int m);
}

class lambdademo2 {
    public static void main(String[] args) {
        numerictest isfactor = (n, d) -> (n % d) == 0;
        if(isfactor.test(10, 2)) {
            System.out.println("2 is the factor of 10");
        }
        if(isfactor.test(10, 3)) {
            System.out.println("3 is the factor of 10");
        }
        System.out.println();

        numerictest lessthan = (n, m) -> (n < m);
        if(lessthan.test(2, 10)) {
            System.out.println("2 is less than 10");
        }
        if(lessthan.test(10, 3)) {
            System.out.println("10 is less than 3");
        }
        System.out.println();

        numerictest absequal = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if(absequal.test(4, -4)) {
            System.out.println("Absolute value of 4 & -4 are equal");
        }
        if(!lessthan.test(4, -5)) {
            System.out.println("Absolute values of 4 & -5 are not equal");
        }
        System.out.println();
    }
}

interface stringtest {
    boolean test(String astr, String bstr);
}

class lambdademo3 {
    public static void main(String[] args) {
        stringtest isin = (a, b) -> a.indexOf(b) != -1;

        String str = "This is a test for JavaSE-14";
        System.out.print("Testing string: " + str);
        try {
            for(int i = 0; i < 20; i++) {
                System.out.print(".");
                Thread.sleep(100);
            }
        } catch(InterruptedException exc) {
            System.out.println("Error: " + exc);
        }

        if(isin.test(str, "JavaSE-14")) {
            System.out.println("\n'JavaSE-14' found");
        }
        else {
            System.out.println("\n'JavaSE-14' not found");
        }

        if(isin.test(str, "xyz")) {
            System.out.println("'xyz' found");
        }
        else {
            System.out.println("'xyz' not found");
        }
    }
}

interface numericfunc {
    int func(int n);
}

class blocklambdademo {
    public static void main(String[] args) {
        numericfunc smallestfnc = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;

            for(int i = 2; i < n/i; i++) {
                if((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        System.out.println("Smallest factor of 12 is " + smallestfnc.func(12));
        System.out.println("Smallest factor of 11 is " + smallestfnc.func(11));
    }
}

interface sometest<T> {
    boolean test(T n, T m);
}

class genfuncinterdemo {
    public static void main(String[] args) {
        sometest<Integer> isfactor = (n, d) -> (n % d) == 0;
        if(isfactor.test(10, 2)) {
            System.out.println("2 is a factor of 10");
        }
        System.out.println();

        sometest<Double> isfactorD = (n, d) -> (n % d) == 0;
        if(isfactorD.test(212.0, 4.0)) {
            System.out.println("4.0 is the factor of 212.0");
        }
        System.out.println();

        sometest<String> isin = (a, b) -> a.indexOf(b) != -1;
        String str = "Generic Functional Interface in JavaSE-14";
        System.out.print("Testing: " + str);
        for(int i = 0; i < 20; i++) {
            try {
                System.out.print(".");
                Thread.sleep(50);
            } catch(InterruptedException exc) {
                System.out.println("Error: " + exc);
        }   }
        if(isin.test(str, "JavaSE-14")) {
            System.out.println("\n'JavaSE-14' is found");
        }
        else {
            System.out.println("\n'JavaSE-14' not found");
        }
        if(isin.test(str, "face")) {
            System.out.println("'face' is found");
        }
        else {
            System.out.println("'face' not found");
        }
    }
}

interface stringfunc {
    String func(String str);
}

class lambdaargsdemo {
    static String changestr(stringfunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String instr = "Lambda expressions expand JavaSE-14";
        String outstr;

        System.out.println("Here is input string: " + instr);

        stringfunc reverse = (str) -> {
            String result = "";
            for(int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        outstr = changestr(reverse, instr);
        System.out.println("The string reversed: " + outstr);

        outstr = changestr((str) -> str.replace(' ', '-'), instr);
        System.out.println("The string with spaces replaced: " + outstr);

        outstr = changestr((str) -> {
            String result = "";
            char ch;
            for(int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch)) {
                    result += Character.toLowerCase(ch);
                }
                else {
                    result += Character.toUpperCase(ch);
                }
            }
            return result;
        }, instr);
        System.out.println("The string is reversed case: " + outstr);
    }
}

interface myfunc {
    int func(int n);
}

class varcapture {
    public static void main(String[] args) {
        int num = 10;

        myfunc mylambda = (n) -> {
            int v = num + n;

            // num++;

            return v;
        };
        System.out.println(mylambda.func(8));

        // num = 9;
    }
}

interface myioaction {
    boolean ioaction(Reader rdr) throws IOException;
}

class lambdaExceptiondemo {
    public static void main(String[] args) {
        myioaction myio = (rdr) -> {
            int ch = rdr.read();
            System.out.println(ch);//to prevent error
            return true;
        };
        System.out.println(myio);//to prevent error
    }
}