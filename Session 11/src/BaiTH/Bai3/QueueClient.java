package BaiTH.Bai3;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        System.out.println("log 1 -----> " + queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println("log 2 -----> " + queue);
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
        queue.dequeue();
        System.out.println("log 3 -----> " + queue);

    }
}
