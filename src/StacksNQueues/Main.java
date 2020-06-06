package StacksNQueues;

public class Main {
    public static void main(String[] args) {
        //stackRunner();
        queueRunner();
    }

    public static void queueRunner(){
        Queues q = new Queues();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");

        q.print();

        q.dequeue();
        q.print();

        q.dequeue();
        q.print();

        q.dequeue();
        q.print();

        q.dequeue();
        q.print();
    }

    public static void stackRunner(){
        Stacks s = new Stacks();
        s.push("C");
        s.push("B");
        s.push("A");

        s.print();

        s.pop();
        s.print();

        s.pop();
        s.print();

        s.pop();
        s.print();

        s.pop();
        s.print();

    }
}
