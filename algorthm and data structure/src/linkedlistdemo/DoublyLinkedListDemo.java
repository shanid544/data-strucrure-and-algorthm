package linkedlistdemo;

public class DoublyLinkedListDemo {

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtHead(12);
        list.insertAtHead(34);
        list.insertAtHead(14);
        list.insertAtHead(24);
        list.insertAtHead(44);

        System.out.println(list);
    }
}
