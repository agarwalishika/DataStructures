package StacksNQueues;

class Node<Item> {
    private Item data;
    private Node next;

    Node(Item str){
        this.data = str;
        next = null;
    }

    void setNext(Node next){
        this.next = next;
    }

    Node getNext(){
        return next;
    }

    Item getData(){
        return data;
    }
}
