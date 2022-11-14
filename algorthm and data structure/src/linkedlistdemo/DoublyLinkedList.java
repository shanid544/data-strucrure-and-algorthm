package linkedlistdemo;

public class DoublyLinkedList {

    private DoublyLinkedNode head;

    public void insertAtHead(int value){
        DoublyLinkedNode newDoublyLinkedNode = new DoublyLinkedNode(value);

        newDoublyLinkedNode.setNext(this.head);
        if(this.head!=null){
            this.head.setPrevious(newDoublyLinkedNode);
        }
        this.head=newDoublyLinkedNode;


    }


    @Override
    public String toString() {

        DoublyLinkedNode current = head;
        String result = "{";
        while (current!=null){
            result=result+current.toString()+ " ";
            current=current.getNext();
        }
        result+="}";
        return result;
    }
}
