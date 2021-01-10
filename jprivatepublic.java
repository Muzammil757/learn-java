package Learn_Java;

class jprivatepublic {
    private int alpha;
    public int beta;
    int gamma;

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class privatedemo {
    public static void main(String[] args) {
        jprivatepublic ob = new jprivatepublic();

        ob.setAlpha(100);//private can only access through methods
        System.out.println("Alpha is " + ob.getAlpha());

        // ob.alpha = 5; // This is wrong!

        ob.beta = 7;
        System.out.println("Beta is " + ob.beta);

        ob.gamma = 12;
        System.out.println("Gamma is " + ob.gamma);
    }
}

class failsoft {
    private int a[];
    private int errval;
    public int length;

    public failsoft(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }

    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        if(index >= 0 & index < length) return true;
        return false;
    }
}

class fsdemo {
    public static void main(String[] args) {
        failsoft fs = new failsoft(5, -1);
        int x;

        System.out.print("Fail quietly.");
        for(int i = 0; i < (fs.length*2); i++) {
            fs.put(i, i*10);
        }

        for(int i = 0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("\nFail with error reports.");
        for(int i = 0; i < (fs.length*2); i++) {
            if(!fs.put(i, i*10))
            System.out.println("Index " + i + " out of bounds.");
        }

        for(int i = 0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1)
            System.out.print(x + " ");
            else
            System.out.println("Index " + i + " out of bounds.");
        }
    }
}