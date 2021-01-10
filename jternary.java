package Learn_Java;

class jternary {
    public static void main(String[] args) {
        int result;

        for(int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0;//This prevents 0 to be divided
            if( i != 0 )
            System.out.println("100 / " + i + " is " + result);
        }
    }
}

class ternary2 {
    public static void main(String[] args) {
        for(int i = -5; i < 6; i++) {
            if(i != 0 ? true : false) {
                System.out.println("100 / " + i + " is " + 100 / i);
            }
        }
    }
}