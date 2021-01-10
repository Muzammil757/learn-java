package Learn_Java;

class thisv1 {
    double b;
    int e;
    double val;

    thisv1( double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if( exp == 0 ) return;
        for( ; exp > 0; exp--) val = val * base;
    }

    double getPwr() {
        return val;
    }
}

class jthisdemo {
    public static void main(String[] args) {
        thisv1 x = new thisv1(6, 2);
        thisv1 y = new thisv1(8.6, 9);
        thisv1 z = new thisv1(20, 7);

        System.out.println(x.b + " raise to the " + x.e + " power is " + x.getPwr());

        System.out.println(y.b + " raise to the " + y.e + " power is " + y.getPwr());

        System.out.println(z.b + " raise to the " + z.e + " power is " + z.getPwr());
    }
}

class thisv2 {
    double b;
    int e;
    double val;

    thisv2( double b, int e) {
        this.b = b; //This refers to the instance var not the parameter.
        this.e = e;

        this.val = 1;
        if( e == 0 ) return;
        for( ; e > 0; e--) this.val = this.val * b;
    }

    double getPwr() {
        return this.val;
    }
}

class thisdemov2 {
    public static void main(String[] args) {
        thisv2 x = new thisv2(6, 2);
        thisv2 y = new thisv2(8.6, 9);
        thisv2 z = new thisv2(20, 7);

        System.out.println(x.b + " raise to the " + x.e + " power is " + x.getPwr());

        System.out.println(y.b + " raise to the " + y.e + " power is " + y.getPwr());

        System.out.println(z.b + " raise to the " + z.e + " power is " + z.getPwr());
    }
}