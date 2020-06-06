package StacksNQueues;

public class Main {
    public static void main(String[] args) {
        stackRunner();
        queueRunner();
    }

    public static void stackRunner(){
        Stacks<Integer> s = new Stacks<>();
        s.push(3);
        s.push(2);
        s.push(1);

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

    public static void queueRunner(){
        Queues<Integer> q = new Queues<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

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
}
