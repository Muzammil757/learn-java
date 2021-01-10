package Learn_Java.Packages;
//protected member can't be accessible by different package on non-subclass only otherwise protect is access everywhere, it can also access different package and it's subclass
class Book1 {
    protected String title;
    protected String author;
    protected int pubdate;

    Book1(String t, String a, int p) {
        title = t;
        author = a;
        pubdate = p;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubdate);
    }
}

class extBook extends Book1 {
    private String publisher;

    extBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    String getpublisher() {
        return publisher;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    int getpubDate() {
        return pubdate;
    }
}

class protectdemo {
    public static void main(String[] args) {
        extBook books[] = new extBook[3];

        books[0] = new extBook("JavaSE-14", "Oracle", 2019, "Oracle press");
        books[1] = new extBook("JavaFX-8", "Oracle", 2015, "Oracle press");
        books[2] = new extBook("inBooks", "inIndex", 2020, "inPub");

        for(int i = 0; i < books.length; i++) {
            books[i].show();
        }

        System.out.println("Showing all books by Oracle");
        for(int i = 0; i < books.length; i++) {
            if(books[i].getAuthor() == "Oracle") {
                System.out.println(books[i].getTitle());
            }
        }
    }
}