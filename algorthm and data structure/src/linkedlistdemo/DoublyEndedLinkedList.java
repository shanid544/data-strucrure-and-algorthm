package linkedlistdemo;

public class DoublyEndedLinkedList {

    private Node head;
    private Node tail;

    public void inserAtTail(int data){
        Node newNode = new Node(data);
        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
        }
        if(this.tail != null){
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }

    @Override
    public String toString(){
        Node current = head;
        String result = "{";
        while (current!=null){
            result=result+current.toString()+ " ";
            current=current.getNext();
        }
        result+="}";
        return result;
    }
}
