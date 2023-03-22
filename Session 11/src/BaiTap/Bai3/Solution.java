package BaiTap.Bai3;

public class Solution extends Queue {
    public Solution(Node front, Node rear) {
        super(front, rear);
    }

    public Solution() {
    }

    void enqueue(int item) {
        Node temp = new Node(item);
        if (front == null) {
            front = temp;
            rear = temp;
        } else {
            rear.link = temp;
            rear = temp;
        }
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Undeflow");
        }
        Node temp = front;
        front = front.link;
        if (front == null) {
            rear = null;
        }
        return temp.data;
    }

    void displayQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
