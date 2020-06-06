package StacksNQueues;

import java.util.ArrayList;

public class Queues {
    private ArrayList<String> data;

    Queues(){
        data = new ArrayList<>();
    }

    void enqueue(String str){
        data.add(str);
    }

    String dequeue(){
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
