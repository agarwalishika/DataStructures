package StacksNQueues;

class Node {
    private String str;
    private Node next;

    Node(String str){
        this.str = str;
        next = null;
    }

    void setNext(Node next){
        this.next = next;
    }

    Node getNext(){
        return next;
    }

    String getStr(){
        return str;
    }
}
