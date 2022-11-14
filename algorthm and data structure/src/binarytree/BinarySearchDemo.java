package binarytree;

public class BinarySearchDemo {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(10);
        b.insert(20);
        b.insert(4);
        b.insert(14);
        b.insert(8);
        b.insert(44);

        System.out.println(b.find(8));
        System.out.println(b.find(20));
        System.out.println(b.find(21));
        System.out.println(b.smallest());
        System.out.println(b.largest());


    }
}
