package linkedlistdemo;

public class LinkedListDemo {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(10);
        linkedList.insertAtHead(20);
        linkedList.insertAtHead(30);
        linkedList.insertAtHead(40);
        linkedList.insertAtHead(50);

        System.out.println(linkedList);

        System.out.println(linkedList.length());

        linkedList.deleteHeadNode();
        System.out.println(linkedList);
        System.out.println(linkedList.length());

        System.out.println(linkedList.find(20));
        System.out.println(linkedList.find(200));



    }
}
