package Learn_Java.jProjects;

class jhelp {
    public static void main (String[] args)
    throws java.io.IOException {
        char choice;
        System.out.println("\nJava Help:");
        System.out.println("  1: if");
        System.out.println("  2: switch");
        System.out.print("Choose one of'em:\n>>> ");
        choice = (char) System.in.read();
        System.out.println("\n");

        switch (choice) {
            case '1':
            System.out.println("The if:\n");
            System.out.println("if(condition) statement;");
            System.out.println("else statement;");
            break;

            case '2':
            System.out.println("The switch:\n");
            System.out.println("switch(expression) {");
            System.out.println("  case constant:");
            System.out.println("   statement(s)");
            System.out.println("   break;");
            System.out.println("   \\...");
            System.out.println("}");
            break;

            default:
            System.out.println("Selection not found!");
        }
    }
}

class jhelp2 {
    public static void main(String[] args)
    throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("\nJava Help:");
            System.out.println("  1: if");
            System.out.println("  2: switch");
            System.out.print("Choose one of'em:\n>>> ");
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while( ignore != '\n');
        }while(( choice < '1') | (choice > '2'));
        System.out.println("\n");

        switch(choice) {
            case '1':
            System.out.println("The if:\n");
            System.out.println("if(condition) statement;");
            System.out.println("else statement;");
            break;

            case '2':
            System.out.println("The switch:\n");
            System.out.println("switch(expression) {");
            System.out.println("  case constant:");
            System.out.println("   statement(s)");
            System.out.println("   break;");
            System.out.println("   \\...");
            System.out.println("}");
            break;
        }
    }
}

class jhelp3 {
    public static void main(String[] args)
    throws java.io.IOException {
        char choice, ignore;

    for( ; ; ) {

        do {
            System.out.println("\nJava Help:");
            System.out.println("  1: if");
            System.out.println("  2: switch");
            System.out.print("Choose one of'em (Press 'q' to quit):\n>>> ");
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while( ignore != '\n');
        }while(( choice < '1') | (choice > '2') & (choice != 'q'));

        if( choice == 'q' ) {
            System.out.println("Thank you for using our service!");
            break;
        }
        System.out.println("\n");

        switch(choice) {
            case '1':
            System.out.println("The if:\n");
            System.out.println("if(condition) statement;");
            System.out.println("else statement;");
            break;

            case '2':
            System.out.println("The switch:\n");
            System.out.println("switch(expression) {");
            System.out.println("  case constant:");
            System.out.println("   statement(s)");
            System.out.println("   break;");
            System.out.println("   \\...");
            System.out.println("}");
            break;
        }
        System.out.println();
        }
    }
}

class helpv4 {
    void showmenu() {
        System.out.println("\n=======================\n");
        System.out.println("Help:");
        System.out.println("  1. Apple");
        System.out.println("  2. Microsoft");
        System.out.println("  3. Android");
        System.out.println("  4. Linux");
        System.out.println("  5. Intel\n");
        System.out.print("Enter your choice (Press q to quit):\n>>> ");
    }

    boolean isValid (int ch) {
        if(ch < '1' | ch > '5' & ch != 'q') return false;
        else return true;
    }

    void submenu(int what) {
        switch(what) {
            case '1':
            System.out.println("\nAbout iPhone:");
            System.out.println("iPhone(2007)\niPhone 3G(2008)\niPhone 4(2010)\niPhone 5(2012)\niPhone 6(2014)\niPhone SE(2016)\niPhone 7(2016)\niPhone 8(2017)\niPhone X(2017)\niPhone 11(2019)\niPhone SE2(2020)");
            System.out.println("\nAbout iPad:");
            System.out.println("iPad A9\niPad pro\nThat's what we knew about it!");
            System.out.println("\nAbout Apple watch:");
            System.out.println("Apple watch series 4\nApple watch series 5 is remarkable");
            break;
            
            case '2':
            System.out.println("\nAbout Windows:");
            System.out.println("Windows XP\nWindows Vista\nWindows 7\nWindows 8\nWindows 8.1\nWindows 10");
            break;

            case '3':
            System.out.println("\nAbout Android:");
            System.out.println("Kitkat\nLolipop\nMarshmello\nNought\nOreo\nPie");
            break;

            case '4':
            System.out.println("\nAbout Linux:");
            System.out.println("Kali Linux\nLinux mint\nUbuntu\nDebian\nArch...");
            break;
            
            case '5':
            System.out.println("\nAbout Intel:");
            System.out.println("Pentium 3\nPentium 4\nCore to Duo\nCore i3\nCore i5\nCore i7\nCore i9(Hibrid Latest Release)");
            break;
        }
        System.out.println();
    }
}

class help4 {
    public static void main(String[] args)
    throws java.io.IOException {
        char choice, ignore;
        helpv4 hobject = new helpv4();

        for( ; ; ) {
            do{
                hobject.showmenu();

                choice = (char) System.in.read();

                do{
                    ignore = (char) System.in.read();
                }while(ignore != '\n');
            }while(!hobject.isValid(choice));

            if( choice == 'q') break;

            System.out.println("\n");

            hobject.submenu(choice);
        }
    }
}