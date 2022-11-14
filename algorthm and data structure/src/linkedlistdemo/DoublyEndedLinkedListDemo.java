package linkedlistdemo;

public class DoublyEndedLinkedListDemo {

    public static void main(String[] args){

        DoublyEndedLinkedList doublyEndedLinkedList = new DoublyEndedLinkedList();

        doublyEndedLinkedList.inserAtTail(12);
        doublyEndedLinkedList.inserAtTail(11);
        doublyEndedLinkedList.inserAtTail(12);
        doublyEndedLinkedList.inserAtTail(14);

        System.out.println(doublyEndedLinkedList);
    }
}
