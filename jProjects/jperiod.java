package Learn_Java.jProjects;

class jperiod {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch;
        int spaces = 0;
        System.out.print("Enter a period to stop.(Stop by using dot'.')\n>>>");
        do {
            ch = (char) System.in.read();
            if( ch == ' ') spaces++;
        }while( ch != '.');
        System.out.println("Spaces: " + spaces);
    }
}