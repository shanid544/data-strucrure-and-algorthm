package Queue;

public class QueueDemo {

    public static void main(String a[]) {

        Queue queue = new Queue(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(99);
        queue.enqueue(56);
        queue.dequeue();
        queue.enqueue(43);
        queue.dequeue();
        queue.enqueue(89);
        queue.enqueue(77);
        queue.dequeue();
        queue.enqueue(32);
        queue.enqueue(232);
    }
}
