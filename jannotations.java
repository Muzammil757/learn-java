package Learn_Java;

@Deprecated
class anno {
    private String msg;

    anno(String m) {
        msg = m;
    }

    @Deprecated
    String getmsg() {
        return msg;
    }
}

class annodemo {
    public static void main(String[] args) {
        anno myanno = new anno("Test");
        System.out.println(myanno.getmsg());
    }
}