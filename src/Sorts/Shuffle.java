package Sorts;

public class Shuffle {

    int[] shuffle(int[] nums){
        int length = nums.length;
        int[][] shuffled = new int[2][length];

        for (int i = 0; i < length; i++){
            shuffled[0][i] = nums[i];
            shuffled[1][i] = ((int)(Math.random() * length));
        }

        sort(shuffled);

        return shuffled[0];
    }

    private int[][] sort(int[][] nums){
        int h = 1;
        while (h < nums[0].length / 3){
            h = 3 * h + 1;
        }

        while (h >= 1){
            hSort(nums, h);
            h /= 3;
        }

        return nums;
    }

    private void hSort(int[][] nums, int h){
        for (int i = h; i < nums[0].length; i += h){
            for (int j = i; j > 0; j -= h){
                if (nums[1][j] < nums[1][j - h]){
                    swap(nums, j, j - h);
                }
            }
        }
    }

    private void swap(int[][] nums, int from, int to){
        int temp = nums[0][from];
        nums[0][from] = nums[0][to];
        nums[0][to] = temp;

        temp = nums[1][from];
        nums[1][from] = nums[1][to];
        nums[1][to] = temp;
    }
}