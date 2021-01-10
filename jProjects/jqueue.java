package Learn_Java.jProjects;

class jqueue {
    char q[];
    int putloc,getloc;

    jqueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Queue is full!");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty!");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class Queuedemo {
    public static void main(String[] args) {
        jqueue bigQ = new jqueue(100);
        jqueue smallQ = new jqueue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store alphabets.");
        for( i = 0; i < 26; i++)
        bigQ.put((char)('A' + i));

        System.out.print("Contents of bigQ: ");
        for( i = 0; i < 26; i++ ) {
            ch = bigQ.get();
        if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors!");
        for( i = 0; i < 5; i++ ) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char)('Z' - i));
            System.out.println();
        }
        System.out.println();

        System.out.print("Contents of smallQ: ");
        for( i = 0; i < 5; i++ ) {
            ch = smallQ.get();
        if( ch != (char) 0) System.out.print(ch);
        }
    }
}

class queue2 {
    private char q[];
    private int putloc, getloc;

    queue2(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    queue2(queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for(int i = getloc; i < putloc; i++)
        q[i] = ob.q[i];
    }

    queue2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i = 0; i < a.length; i++) put(a[i]);
    }

    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full!");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty!");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class queue2demo {
    public static void main(String[] args) {
        queue2 q1 = new queue2(10);

        char name[] = {'T', 'o', 'm'};

        queue2 q2 = new queue2(name);

        char ch;
        int i;

        for(i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        queue2 q3 = new queue2(q1);

        System.out.print("Contents of q1: ");
        for(i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("Contents of q2: ");
        for(i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("Contents of q3: ");
        for(i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
        System.out.println();
    }
}