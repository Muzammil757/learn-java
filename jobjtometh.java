package Learn_Java;

class jobjtometh {
    int a, b, c;
    int vol;

    jobjtometh(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        vol = a*b*c;
    }

    boolean sameBlock(jobjtometh  ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    boolean sameVol(jobjtometh ob) {
        if(ob.vol == vol) return true;
        else return false;
    }
}

class passob {
    public static void main(String[] args) {
        jobjtometh ob1 = new jobjtometh(10, 5, 2);
        jobjtometh ob2 = new jobjtometh(10, 5, 2);
        jobjtometh ob3 = new jobjtometh(5, 4, 5);

        System.out.println("ob1 has same dem as ob2 " + ob1.sameBlock(ob2));

        System.out.println("ob1 has same dem as ob3 " + ob1.sameBlock(ob3));

        System.out.println("ob1 has same vol as ob3 " + ob1.sameVol(ob3));
    }
}

class Test1 {
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}

class Test1demo {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        int a = 15, b = 20;

        System.out.println("a & b before call: " + a + " " + b);

        ob.noChange(a, b);

        System.out.println("a & b after call: " + a + " " + b);
    }
}

class test2 {
    int a, b;

    test2(int i, int j) {
        a = i;
        b = j;
    }

    void change(test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class test2demo {
    public static void main(String[] args) {
        test2 ob = new test2(15, 20);

        System.out.println("a & b before call: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("a & b after call: " + ob.a + " " + ob.b);
    }
}