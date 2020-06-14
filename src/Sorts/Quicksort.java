package Sorts;

public class Quicksort {

    void sort(int[] nums, int low, int high){
        if (high <= low){
            return;
        }

        int mid = partition(nums, low, high);
        sort(nums, low, mid);
        sort(nums, mid + 1, high);
    }

    int partition(int[] nums, int low, int high){
        int partition = nums[low];

        int i = low;
        int j = high;

        while (true){
            while (nums[i] < partition){
                i++;
            }

            while (nums[j] > partition){
                j--;
            }

            if (j <= i){
                break;
            } else {
                swap(nums, i, j);
            }
        }

        return j;

    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
