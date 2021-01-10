package Learn_Java;

class jlenth {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = { 1, 2, 3};
        int table[][] = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        System.out.println("Length of list is: " + list.length);
        System.out.println("Length of nums is: " + nums.length);
        System.out.println("Length of table is: " + table.length);
        System.out.println("Length of table-0 is: " + table[0].length);
        System.out.println("Length of table-1 is: " + table[1].length);
        System.out.println("Length of table-2 is: " + table[2].length);
        System.out.println();

        for(int i =0; i < list.length; i++)
        list[i] = i*i;

        System.out.print("Here is the list: ");
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}

class lencopy {
    public static void main(String[] args) {
        int i;
        int num1[] = new int[10];
        int num2[] = new int[10];

        for(i = 0; i < num1.length; i++)
        num1[i] = i;

        if(num2.length >= num1.length)
            for( i = 0; i < num1.length; i++ )
                num2[i] = num1[i];

            for( i = 0; i < num2.length; i++ )
                System.out.print(num2[i] + " ");
    }
}