package Sorts;

public class Shellsort {

    int[] sort(int[] nums){
        int h = 1;
        while (h < nums.length / 3){
            h = 3 * h + 1;
        }

        while (h >= 1){
            hSort(nums, h);
            h /= 3;
        }

        return nums;
    }

    private void hSort(int[] nums, int h){
        for (int i = h; i < nums.length; i += h){
            for (int j = i; j > 0; j -= h){
                if (nums[j] < nums[j - h]){
                    swap(nums, j, j - h);
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
