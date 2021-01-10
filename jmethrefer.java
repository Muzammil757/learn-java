package Learn_Java;

interface intpredicate {
    boolean test(int n);
}

class myintpredicate {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= n/i; i++) {
            if((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
    static boolean isEven(int n) {
        return (n % 2) == 0;
    }
    static boolean isPositive(int n) {
        return n > 0;
    }
}

class methRefdemo {
    static boolean numtest(intpredicate p, int v) {
        return p.test(v);
    }
    public static void main(String[] args) {
        boolean result;

        result = numtest(myintpredicate::isPrime, 17);
        if(result) {
            System.out.println("17 is prime");
        }
        result = numtest(myintpredicate::isEven, 12);
        if(result) {
            System.out.println("12 is even");
        }
        result = numtest(myintpredicate::isPositive, 11);
        System.out.println("11 is positive");
    }
}

class myintnum {
    private int v;
    myintnum(int x) {
        v = x;
    }
    int getnum() {
        return v;
    }
    boolean isFactor(int n) {
        return(v % n) == 0;
    }
}

class methrefdemo2 {
    public static void main(String[] args) {
        boolean result;
        myintnum mynum = new myintnum(12);
        myintnum mynum1 = new myintnum(16);

        intpredicate ip = mynum::isFactor;

        result = ip.test(3);
        if(result) System.out.println("3 is a factor of " + mynum.getnum());

        ip = mynum1::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 is not a factor of " + mynum1.getnum());
    }
}

interface myintnumpredicate {
    boolean test(myintnum1 mv, int n);
}

class myintnum1 {
    private int v;
    myintnum1(int x) {
        v = x;
    }
    int getnum() {
        return v;
    }
    boolean isFactor(int n) {
        return(v % n) == 0;
    }
}

class methrefdemo3 {
    public static void main(String[] args) {
        boolean result;

        myintnum1 mynum = new myintnum1(12);
        myintnum1 mynum1 = new myintnum1(16);

        myintnumpredicate inp = myintnum1::isFactor;
        result = inp.test(mynum, 3);
        if(result) System.out.println("3 is a factor of " + mynum.getnum());

        result = inp.test(mynum1, 3);
        if(!result) System.out.println("3 is not a factor " + mynum1.getnum());
    }
}

interface myfunc1 {
    myclass func(String s);
}

class myclass{
    private String str;
    myclass(String s) {
        str = s;
    }
    myclass() {
        str = "";
    }
    String getstr() {
        return str;
    }
}

class constructorRefdemo {
    public static void main(String[] args) {
        myfunc1 myclasscons = myclass::new;
        myclass mc = myclasscons.func("Testing...");
        System.out.println("str in mc is " + mc.getstr());
    }
}