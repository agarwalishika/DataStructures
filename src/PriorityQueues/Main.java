package PriorityQueues;

public class Main {
    public static void main(String[] args) {
        testMinHeap();
    }

    static void testMinHeap(){
        MinHeap mh = new MinHeap();

        mh.insert(5);
        mh.insert(7);
        mh.insert(6);
        mh.insert(2);
        mh.insert(8);
        mh.insert(9);
        mh.insert(1);


        mh.print();

        mh.delMin();
        mh.print();
    }
}
