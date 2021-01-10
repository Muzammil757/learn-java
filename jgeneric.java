package Learn_Java;

class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }
    T getob() {
        return ob;
    }
    void showtype() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class Gendemo {
    public static void main(String[] args) {
        Gen<Integer> iob;
        iob = new Gen<Integer>(88);
        iob.showtype();
        int v = iob.getob();
        System.out.println("Value: " + v);

        System.out.println();

        Gen<String> strob = new Gen<String>("Generics Test...");
        strob.showtype();
        String str = strob.getob();
        System.out.println("Value: " + str);
    }
}

class twogen<T,V> {
    T ob1;
    V ob2;
    twogen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    void showtypes() {
        System.out.println("Type of T is " + ob1.getClass().getName()); 
        System.out.println("Type of V is " + ob2.getClass().getName());
    }
    T getob1() {
        return ob1;
    }
    V getob2() {
        return ob2;
    }
}

class twogendemo {
    public static void main(String[] args) {
        twogen<Integer, String> tgob = new twogen<Integer, String>(100, "Generics");
        tgob.showtypes();
        int v = tgob.getob1();
        System.out.println("Value(Num): " + v);
        String str = tgob.getob2();
        System.out.println("Value(Str): " + str);
    }
}

class numericfns<T extends Number> {
    T num;

    numericfns(T n) {
        num = n;
    }
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}

class boundeddemo {
    public static void main(String[] args) {
        numericfns<Integer> iob = new numericfns<Integer>(5);
        System.out.println("Reciprocal of iob is " + iob.reciprocal());
        System.out.println("Fractional component of iob is " + iob.fraction());

        System.out.println();

        numericfns<Double> dob = new numericfns<Double>(5.25);
        System.out.println("Reciprocal of iob is " + dob.reciprocal());
        System.out.println("Fractional component of iob is " + dob.fraction());

      //numericfns<String> strob = new numericfns<String>("Error: This won't excute, because String is not a subclass of Number");
    }
}

class numericfns1<T extends Number> {
    T num;
    numericfns1(T n) {
        num = n;
    }
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
    boolean absEqual(numericfns1<?> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;

        return false;
    }
}

class wildcarddemo {
    public static void main(String[] args) {
        numericfns1<Integer> iob = new numericfns1<Integer>(6);
        numericfns1<Double> dob = new numericfns1<Double>(-6.0);
        numericfns1<Long> lob = new numericfns1<Long>(5L);

        System.out.println("Testing iob and dob...");
        if(iob.absEqual(dob))
        System.out.println("Absolute values are equal.");
        else
        System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Testing iob and lob...");
        if(iob.absEqual(lob))
        System.out.println("Absolute values are equal.");
        else
        System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Testing dob and lob...");
        if(dob.absEqual(lob))
        System.out.println("Absolute values are equal.");
        else
        System.out.println("Absolute values differ.");
    }
}

class A4 {}
class B4 extends A4 {}
class C4 extends A4 {}
class D4 {}
class Gen1<T> {
    T ob;
    Gen1(T o) {
        ob = o;
    }
}

class useboundedwildcards {
    static void test(Gen1<? extends A4> o) {}
    public static void main(String[] args) {
        A4 a = new A4();
        B4 b = new B4();
        C4 c = new C4();
        D4 d = new D4();

        Gen1<A4> w = new Gen1<A4>(a);
        Gen1<B4> w1 = new Gen1<B4>(b);
        Gen1<C4> w2 = new Gen1<C4>(c);
        Gen1<D4> w3 = new Gen1<D4>(d);
        System.out.println(w3);//just to prevent error!

        test(w);
        test(w1);
        test(w2);

      //test(w3); //Error! because w3 is not a subclass of A  
    }
}

class genMethoddemo {
    static <T extends Comparable<T>, V extends T> boolean arrayequal(T[] x, V[] y) {
        if(x.length != y.length) return false;

        for(int i = 0; i < x.length; i++)
            if(!x[i].equals(y[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums1[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 9, 4, 5};
        Integer nums3[] = {1, 2, 3, 4, 5, 6};

        if(arrayequal(nums, nums))
        System.out.println("nums equal nums");

        if(arrayequal(nums, nums1))
        System.out.println("nums equal nums1");

        if(arrayequal(nums, nums2))
        System.out.println("nums equal nums2");

        if(arrayequal(nums, nums3))
        System.out.println("nums equal nums3");

        Double dvals[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(dvals);//for preventing error
        
      //if(arrayequal(nums, dvals))
      //System.out.println("nums equal dvals");//this won't exc nums & dvals are not of same type  
    }
}

class summation {//a constructor is generic even it's class is not
    private int sum;

    <T extends Number> summation(T args) {
        sum = 0;
        for(int i = 0; i < args.intValue(); i++) {
            sum += i;
        }
    }
    int getsum() {
        return sum;
    }
}

class genconsdemo {
    public static void main(String[] args) {
        summation ob = new summation(4.0);
        System.out.println("Summation of 4.0 is " + ob.getsum());
    }
}

interface containment<T> {
    boolean contain(T o);
}

class geninter<T> implements containment<T> {
    T[] arrayref;

    geninter(T[] o) {
        arrayref = o;
    }

    public boolean contain(T o) {
        for(T x: arrayref)
            if(x.equals(o)) return true;
        return false;
    }
}

class geninterdemo {
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};
        geninter<Integer> ob = new geninter<Integer>(x);
        if(ob.contain(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is not in ob");

        if(ob.contain(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is not in ob");
        
      //if(ob.contain(9.56))
      //    System.out.println("9.56 is in ob"); //this is illegal & I know it better than before    
    }
}

class Gen2<T> {
    T ob;

    Gen2(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class rawdemo {
    public static void main(String[] args) {
        Gen2<Integer> iob = new Gen2<Integer>(88);
        System.out.println("iob is " + iob.getob());
        Gen2<String> strob = new Gen2<String>("Generic test...");
        System.out.println("strob is " + strob.getob());
        // Gen2 raw = new Gen2(98.8);
        // double d = (Double) raw.getob();
        // System.out.println("Value: " + d);

        // you can debug it by removing the comments
    }
}

class twogen1<T,V> {
    T ob1;
    V ob2;
    twogen1(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    void showtypes() {
        System.out.println("Type of T is " + ob1.getClass().getName()); 
        System.out.println("Type of V is " + ob2.getClass().getName());
    }
    T getob1() {
        return ob1;
    }
    V getob2() {
        return ob2;
    }
}

class twogendemo1 {
    public static void main(String[] args) {
        twogen1<Integer, String> tgob = new twogen1<>(100, "Generics");//using diamond operator//<>
        tgob.showtypes();
        int v = tgob.getob1();
        System.out.println("Value(Num): " + v);
        String str = tgob.getob2();
        System.out.println("Value(Str): " + str);
    }
}