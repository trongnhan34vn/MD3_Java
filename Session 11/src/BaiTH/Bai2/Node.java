package BaiTH.Bai2;

public class Node {
    int key;
    Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}
