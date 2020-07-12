package PriorityQueues;

public class MinHeap {

    //parent is at k
    //      children are at 2k and 2k+1
    // child is at k
    //      parent is at k/2
    private int[] nums;
    private int N;

    MinHeap(){
        nums = new int[50];
        N = 0;
    }

    void insert(int n){
        nums[N] = n;
        swim(N);
        N++;
    }

    private void swim(int childIndex){
        //keep comparing to the parent until its less than the parent
        int k = childIndex;
        while (k >= 1 && nums[k] < nums[k / 2]){
            swap(k, k / 2);
            k = k / 2;
        }
    }

    private void swap(int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    int delMin(){
        swap(0, N);
        sink(0);
        N--;
        return nums[0];
    }

    private void sink(int parentIndex){
        int k = parentIndex;
        while (k <= N && nums[k] >= nums[2 * k] && nums[k] >= nums[2*k + 1]){
            if (nums[2 * k] > nums[2*k + 1]){
                swap(k , 2 * k);
                k = 2 * k;
            } else {
                swap(k, 2*k + 1);
                k = 2*k + 1;
            }
        }
    }

    void print(){
        for (int i = 0; i < N; i++){
            System.out.println("Parent: " + nums[i] + ", Children: " + nums[2 * i] + ", " + nums[2 * i + 1]);
        }

        int x = 1;
        int index = 0;
        int numSpaces = N * 5;

        while (index < N){
            printNextXNums(x, index, numSpaces);
            System.out.println();
            index += x;
            x *= 2;
            numSpaces -= 5;

        }
    }

    private void printNextXNums(int x, int start, int spaces){
        for (int j = 0; j < spaces; j++){
            System.out.print(" ");
        }
        for (int i = start; i < start + x && i < N; i++) {
            System.out.print(nums[i]);
            for (int j = 0; j < spaces; j++){
                System.out.print(" ");
            }
        }
    }



}
