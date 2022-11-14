package linkedlistdemo;

public class DoublyLinkedNode {

    private int data;
    private DoublyLinkedNode next;
    private DoublyLinkedNode previous;

    DoublyLinkedNode(int val){
        this.data = val;
    }

    public int getData() {
        return data;
    }

    public DoublyLinkedNode getNext() {
        return next;
    }

    public DoublyLinkedNode getPrevious() {
        return previous;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    public void setPrevious(DoublyLinkedNode previous) {
        this.previous = previous;
    }
    @Override
    public String toString() {
        return "value=" + data;
    }

}
