package Sorts;

public class Main {
    public static void main(String[] args) {
        //testSelection();
        //testInsertion();
        //testShell();
        testShuffle();
    }

    static void testSelection(){
        Selection s = new Selection();
        int[] nums = {3, 7, 1, 8, 2, 9, 6, 0, 4, 5};

        print(nums);
        s.sort(nums);
        print(nums);
    }

    static void testInsertion(){
        Insertion i = new Insertion();
        int[] nums = {3, 7, 1, 8, 2, 9, 6, 0, 4, 5};

        print(nums);
        i.sort(nums);
        print(nums);
    }

    static void testShell(){
        Shellsort s = new Shellsort();
        int[] nums = {3, 7, 1, 8, 2, 9, 6, 0, 4, 5};

        print(nums);
        s.sort(nums);
        print(nums);
    }

    static void testShuffle(){
        Shuffle s = new Shuffle();
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        print(nums);
        nums = s.shuffle(nums);
        print(nums);
    }


    static void print(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
