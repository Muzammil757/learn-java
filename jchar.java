package Learn_Java;

class jchar {
    public static void main(String[] args) {
        char ch;
        ch = 'X';
        System.out.println("Ch contains " + ch);

        ch++;
        System.out.println("Ch is now " + ch);

        ch = 90; //It's because of Unicode
        System.out.println("Ch is now " + ch);
    }
}