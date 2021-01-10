package Learn_Java.Packages;

class Book {
    private String title;
    private String author;
    private int pubdate;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        pubdate = p;
    }

    void show() {
        System.out.println("\tTitle: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tPublished: " + pubdate);
        System.out.println();
    }
}

class bookdemo {
    public static void main(String[] args) {
        Book books[] = new Book[4];

        books[0] = new Book("Java: Guide", "Schildt", 2019);
        books[1] = new Book("JavaSE-14", "Oracle", 2020);
        books[2] = new Book("JavaFX-8", "Oracle", 2015);
        books[3] = new Book("inBooks", "inIndex", 2020);

        System.out.println("\nHere for inBooks:\n");

        for(int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}