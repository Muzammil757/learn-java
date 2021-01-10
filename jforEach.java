package Learn_Java;

class jforEach {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}

class jforEachBreak {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
            if( x == 7) break;
        }
        System.out.println("Summation: " + sum);
    }
}

class forNoChange {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};

        for(int x: nums) {
            System.out.print(x + " ");
            x *= 10;//No effect on nums i.e for-each is just used for "read only"
        }
        System.out.println();

        for(int x: nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

class forEach2dim {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        for(int x[]: nums) {
            for(int y: x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}

class search {
    public static void main(String[] args) {
        int nums[] = {6,7,8,9,3,4,5,2,1,0};
        int val = 7;
        boolean found = false;

        for(int x: nums) {
            if(x == val) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Value found Successfully!");
        }
        else {
            System.out.println("Value not found!");
        }
    }
}