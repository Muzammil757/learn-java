package Learn_Java;

class outer {
    int nums[];

    outer(int n[]) {
        nums = n;
    }

    void analyze() {
        inner inob = new inner();

        System.out.println("Minimum: " + inob.min());
        System.out.println("Maximum: " + inob.max());
        System.out.println("Average: " + inob.avg());
    }

    class inner {
        int min() {
            int m = nums[0];

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] < m) m = nums[i];
            }
            return m;
        }
        
        int max() {
            int m = nums[0];

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > m) m = nums[i];
            }
            return m;
        }

        int avg() {
            int a = 0;
            
            for(int i = 0; i < nums.length; i++) {
                a += nums[i];
            }
            return a / nums.length;
        }
    }
}

class nestedclassdemo {
    public static void main(String[] args) {
        int x[] = {3,4,2,1,7,6,5,9,8};

        outer outob = new outer(x);
        outob.analyze();
    }
}