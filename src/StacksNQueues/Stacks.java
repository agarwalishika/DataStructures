package StacksNQueues;

class Stacks {
    Node head;

    void push(String str){
        Node first = new Node(str);
        first.setNext(head);
        head = first;
    }

    String pop(){
        if (head == null){
            return null;
        }

        Node old = head;
        head = head.getNext();
        return old.getStr();
    }

    boolean isEmpty(){
        return head == null;
    }

    int getSize(){
        int size = 0;
        Node curr = head;
        while (curr != null){
            size++;
            curr = curr.getNext();
        }

        return size;
    }

    void print(){
        Node curr = head;
        while (curr != null){
            System.out.print("{ " + curr.getStr() + " } -> ");
            curr = curr.getNext();
        }

        System.out.print("\nlength: " + this.getSize() + ", isEmpty: " + this.isEmpty() + "\n\n");

    }
}
