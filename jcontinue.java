package Learn_Java;

class jcontinue {
    public static void main(String[] args) {
        for( int i = 0; i <= 100; i++ ) {
            if( ( i % 2 ) != 0 ) {
                continue;
            }
            System.out.println(i);
        }
    }
}

class labelcontinue {
    public static void main(String[] args) {
        outerloop:
        for( int i = 0; i < 10; i++ ) {
            System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
            for( int j = 0; j < 10; j++ ) {
                if( j == 5 ) continue outerloop;
                System.out.print(j);
            }
        }
    }
}

class numcontinue {
    public static void main(String[] args) {
        for( int i = 0; i < 10; i++ ) {
            System.out.print(i + " ");
            if(( i % 2 ) == 0) continue;
            System.out.println();
        }
    }
}