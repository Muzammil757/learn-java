package Learn_Java;

class jconstructor {
    int x;

    jconstructor() {
        x = 7;
    }
}

class jconstructordemo {
    public static void main(String[] args) {
        jconstructor t1 = new jconstructor();
        jconstructor t2 = new jconstructor();

        System.out.println(t1.x + " " + t2.x);
    }
}

class paraconstructor {
    int x;

    paraconstructor(int i) {
        x = i;
    }
}

class paraconsDemo {
    public static void main(String[] args) {
        paraconstructor t1 = new paraconstructor(30);
        paraconstructor t2 = new paraconstructor(10);

        System.out.println(t1.x + " " + t2.x);
    }
}