package Learn_Java.jProjects;

class jtruthTable {
    public static void main(String[] args) {
        boolean p,q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = false; q = false;
        System.out.print( p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print( p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print( p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = true;
        System.out.print( p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
}