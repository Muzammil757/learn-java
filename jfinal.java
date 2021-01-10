package Learn_Java;

class errmsg {
    final int inner = 0;
    final int outter = 1;
    final int disk = 2;
    final int index = 3;

    String msg[] = {
        "Output error",
        "Input error",
        "Disk error",
        "Index out-of-bounds"
    };

    String geterr(int i) {
        if(i >= 0 & i < msg.length)
        return msg[i];
        else
        return "Invalid error code";
    }
}

class finalID {
    public static void main(String[] args) {
        errmsg err = new errmsg();

        System.out.println(err.geterr(err.disk));
        System.out.println(err.geterr(err.index));
        System.out.println(err.geterr(5));
    }
}