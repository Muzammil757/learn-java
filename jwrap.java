package Learn_Java;

class wrap {
    public static void main(String[] args) {
        Integer iob = Integer.valueOf(100);

        int i = iob.intValue();

        System.out.println("Manual boxing " + iob + "\nUnboxing " + i);
    }
}

class autobox {
    public static void main(String[] args) {
        Integer iob = 100;

        int i = iob;

        System.out.println("Autoboxing " + iob + "\nUnboxing " + i);
    }
}

class autobox1 {
    static void m(Integer v) {
        System.out.println("m() recieved " + v);
    }

    static int m2() {
        return 10;
    }

    static Integer m3() {
        return 99;
    }

    public static void main(String[] args) {
        m(199);

        Integer iob = m2();
        System.out.println("Return value from m2() is " + iob);

        int i = m3();
        System.out.println("Return value from m3() is " + i);

        iob = 100;
        System.out.println("Sqrt of iob is " + Math.sqrt(iob));
    }
}

class autobox2 {
    public static void main(String[] args) {
        Integer iob, iob1;
        int i;

        iob = 99;
        System.out.println("Original value of iob is " + iob);

        ++iob;
        System.out.println("After ++iob " + iob);

        iob += 10;
        System.out.println("After iob += 10 " + iob);

        iob1 = iob + (iob / 3);
        System.out.println("iob1 after expression: " + iob1);

        i = iob + (iob / 3);
        System.out.println("i after expression: " + i);
    }
}