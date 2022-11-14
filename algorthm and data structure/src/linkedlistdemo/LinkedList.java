package linkedlistdemo;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public int length(){
        Node current = head;
        int length = 0;
        while (current != null){
            length++;
            current = current.getNext();
        }
        return length;
    }

    public void deleteHeadNode(){
        this.head=head.getNext();
    }

    public Node find(int val){
        Node current = head;
        while (current!=null){
            if(current.getValue()==val){
                return current;
            }
            current=current.getNext();
        }
        return null;
    }



    @Override
    public String toString() {

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
