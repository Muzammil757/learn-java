package Learn_Java;

public interface jinterface {
    int getNext();
    void reset();
    void setStart(int x);
}

class series implements jinterface {
    int start;
    int val;

    series() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        val = x;
        start = x;
    }
}

class interfacedemo {
    public static void main(String[] args) {
        series ob = new series();

        System.out.println("Configuring your package...");

        for(int i = 0; i < 5; i++) {
            System.out.println("Prepare for Unpacking " + ob.getNext());
        }

        System.out.println("System is preparing resetting function...\nStage 1...");
        ob.reset();

        for(int i = 0; i < 5; i++) {
            System.out.println("Unpacking respositories..." + ob.getNext());
        }

        System.out.println("\nStarting at 75%...");
        ob.setStart(76);

        for(int i = 0; i < 5; i++) {
            System.out.println("Unpacking directoies..." + ob.getNext());
        }

        System.out.println("\nJust a moment...\n\nAlmost there...\n\nWe're sorry, couldn't found network!\n\t\t\t\t\tError(x0800000)");
    }
}

class series1 implements jinterface {
    int start;
    int val;

    series1() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        val = x;
        start = x;
    }
}

class series2 implements jinterface {
    int start;
    int val;

    series2() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        val = x;
        start = x;
    }
}

class refseries {
    public static void main(String[] args) {
        series1 twoob = new series1();
        series2 threeob = new series2();
        jinterface ob;

        for(int i = 0; i < 5; i++) {
            ob = twoob;
            System.out.println("Prepare for unpacking..." + ob.getNext());

            ob = threeob;
            System.out.println("Unpacking archieves..." + ob.getNext());
        }
    }
}

interface iconst {
    int min = 0;
    int max = 10;
    String errmsg = "Error: Boundary error x0000080";
}

class iconstdemo implements iconst{
    public static void main(String[] args) {
        int nums[] = new int[max];

        for(int i = min; i < 11; i++) {
            if(i >= max) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + errmsg + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            else {
                nums[i] = i;
                System.out.println("Prepare for unpacking archieves..." + nums[i]);
            }
        }
    }
}

interface A3 {
    void meth1();
    void meth2();
}

interface B3 extends A3 {
    void meth3();
}

class extendinterface implements B3 {
    public void meth1() {
        System.out.println("Implementing meth1()...");
    }

    public void meth2() {
        System.out.println("Implementing meth2()...");
    }

    public void meth3() {
        System.out.println("Implementing meth3()...");
    }
}

class extenddemo {
    public static void main(String[] args) {
        extendinterface ob = new extendinterface();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}