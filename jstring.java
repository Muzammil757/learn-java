package Learn_Java;

class jstring {
    public static void main(String[] args) {
        String str = new String("Java strings are objects.");
        String str2 = "They're constructed various ways.";
        String str3 = new String(str2);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}

class strOps {
    public static void main(String[] args) {
        String str1 = "When it comes to web development, java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerfull.";
        int result, index;

        System.out.println("Length of str1: " + str1.length());

        for( int i = 0; i < str1.length(); i++ ) {
            System.out.print(str1.charAt(i)); //Display 1 char at a time.
        }
        System.out.println();

        if(str1.equals(str2)) {
            System.out.println("str1&2 are equal.");
        }
        else {
            System.out.println("str1&2 aren't equal.");
        }

        if(str1.equals(str3)) {
            System.out.println("str1&3 are equal.");
        }
        else {
            System.out.println("str1&3 aren't equal.");
        }

        result = str1.compareTo(str3);
        if(result == 0) {
            System.out.println("str1&3 are equal.");
        }
        else if(result < 0) {
            System.out.println("str1 is less than str3.");
        }
        else {
            System.out.println("str1 is greater than str3.");
        }

        str2 = "One Two Three";

        index = str2.indexOf("One");
        System.out.println("Index of One: " + index);
        index = str2.indexOf("Three");
        System.out.println("Index of Three: " + index);
    }
}

class joinstr {
    public static void main(String[] args) {
        String str1 = "One ";
        String str2 = "Two ";
        String str3 = "Three";
        String str4 = str1 + str2 + str3;

        System.out.println(str4);
    }
}

class strArray {
    public static void main(String[] args) {
        String str[] = {"This", "is", "a", "test."};

        System.out.print("\nOriginal arry: ");
        for(String s: str)
            System.out.print(s + " ");
        System.out.println("\n");

        str[1] = "was";
        str[3] = "test, too!";

        System.out.print("Modified array: ");
        for(String s: str)
            System.out.print(s + " ");
        System.out.println();
    }
}

class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the web move.";

        String substr = orgstr.substring(5, 18);

        System.out.println("orgstring: " + orgstr);
        System.out.println("substring: " + substr);
    }
}

class cmdlineArgs { //if it executes like this "Java cmdlineArgs one two three" then output will be different!
    public static void main(String[] args) {
        System.out.println("There are " + args.length + " command-line args.");

        System.out.println("They are: ");
        for( int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}

class phone {
    public static void main(String[] args) {
        String numbers[][]  = {
            {"Muzammyl", "3106293836"},
            {"Moazzam", "Skype not found!"},
            {"Abu", "3006467169"},
            {"Ammi", "3136467169"}
        };
        int i;

        if(args.length != 1) {
            System.out.println("Usage: java phone <name>");
        }
        else {
            for(i = 0; i < numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length) {
                System.out.println("Name not found.");
            }
        }
    }
}