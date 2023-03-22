package BaiTap.Bai3;

public class Test {
    public static void main(String[] args) {
        Solution q = new Solution();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("Thêm vào queue: ");
        q.displayQueue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Sau khi dequeue: ");
        q.displayQueue();
    }
}
