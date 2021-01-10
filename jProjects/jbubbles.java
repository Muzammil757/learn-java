package Learn_Java.jProjects;

class jbubbles {
    public static void main(String[] args) {
        int num[] = { 55, -88 , -3669, 5455, 54, -87, 369, 8, 123, -2588 };
        int a, b, t, size;
        size = 10;

        System.out.print("Original array is: ");
        for( int i = 0; i < size; i++ ) {
            System.out.print(" " + num[i]);
        }
        System.out.println();

        for( a = 1; a < size; a++ )
            for ( b = size-1; b >= a; b-- ) {
                if(num[b-1] > num[b]) {
                    t = num[b-1];
                    num[b-1] = num[b];
                    num[b] =t;
                }
            }
            System.out.print("Sorted array is: ");
            for( int i = 0; i < size; i++ ) {
                System.out.print(" " + num[i]);
            }
            System.out.println();
    }
}

class quicksort {
    static void qsort(char items[]) {
        qs(items, 0, items.length-1);
    }

    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];
        
        do {
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        }while(i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
}

class qsdemo {
    public static void main(String[] args) {
        char a[] = {'q','e','b','o','l','n','f'};
        int i;

        System.out.print("Original array: ");
        for(i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        quicksort.qsort(a);

        System.out.print("Sorted array: ");
        for(i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}