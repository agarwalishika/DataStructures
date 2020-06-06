package StacksNQueues;

import java.util.ArrayList;

public class Queues<Item> {
    private ArrayList<Item> data;

    Queues(){
        data = new ArrayList<>();
    }

    void enqueue(Item item){
        data.add(item);
    }

    Item dequeue(){
        if (data.size() == 0){
            return null;
        }
        return data.remove(0);
    }

    boolean isEmpty(){
        return data.size() == 0;
    }

    int getSize(){
        return data.size();
    }

    void print(){
        for(int i = 0; i < getSize(); i++){
            System.out.print("{ " + data.get(i) + " } -> ");
        }

        System.out.print("\nlength: " + this.getSize() + ", isEmpty: " + this.isEmpty() + "\n\n");
    }
}
