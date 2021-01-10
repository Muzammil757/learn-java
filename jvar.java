package Learn_Java;

class jvar {
    public static void main(String[] args) {
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        int var = 1;
        System.out.println("Value of var: " + var);

        var k = -var;
        System.out.println("Value of k: " + k);

        var str = "Muzammyl";
        System.out.println("My name is " + str);

        var mystr = "This is a string.";
        var mysubstr = mystr.substring(5, 10);
        System.out.println("Mystr: " + mystr);
        System.out.println("Mysubstr: " + mysubstr);
    }
}

class myvar {
    private int i;

    myvar(int k) { i = k; }

    int geti() { return i; }

    void seti(int k) { if( k >= 0) i = k; }
}

class myvardemo {
    public static void main(String[] args) {
        var mv = new myvar(10);
        System.out.println("Value of i in mv is " + mv.geti());

        mv.seti(20);
        System.out.println("Value of i in mv is " + mv.geti());
    }
}

class jforvar {
    public static void main(String[] args) {
        System.out.print("Value of x: ");
        for(var x = 2.5; x < 100.0; x *= 2)
        System.out.print(x + " ");

        System.out.println();

        int[] nums = { 1,2,3,4,5,6,7 };
        System.out.print("Values in num array: ");
        for(var v : nums)
        System.out.print(v + " ");

        System.out.println();
    }
}