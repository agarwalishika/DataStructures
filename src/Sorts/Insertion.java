package Sorts;

public class Insertion {

    void sort(int[] nums){
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j > 0; j--){
                if (nums[j] < nums[j - 1]){
                    swap(nums, j, j - 1);
                }
            }
        }
    }

    private void swap(int[] nums, int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
