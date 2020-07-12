package Sorts;

public class Merge {

    void sort(int[] nums, int low, int high){
        if (high <= low){
            return;
        }

        int mid = (low + high) / 2;

        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    void merge(int[] nums, int low, int mid, int high){
        int[] copy = new int[nums.length];
        for(int i = low; i <= high; i++){
            copy[i] = nums[i];
        }

        int k = low;
        int j = mid + 1;
        for(int i = low; i <= high; i++){
            if (j <= high && ((k > mid) || (copy[j] < copy[k]))){
                nums[i] = copy[j++];
            } else{
                nums[i] = copy[k++];
            }
        }

    }

}
