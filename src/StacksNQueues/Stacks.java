package StacksNQueues;

class Stacks<Item> {
    private Node head;

    void push(Item item){
        Node first = new Node(item);
        first.setNext(head);
        head = first;
    }

    Item pop(){
        if (head == null){
            return null;
        }

        Node old = head;
        head = head.getNext();
        return (Item) old.getData();
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
            System.out.print("{ " + curr.getData() + " } -> ");
            curr = curr.getNext();
        }

        System.out.print("\nlength: " + this.getSize() + ", isEmpty: " + this.isEmpty() + "\n\n");

    }
}
