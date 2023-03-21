package BaiTH.MyLinkedList;

public class Node {
    Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
        next = null;
    }

    public Node() {
    }

    public Node(Node next, Object data) {
        this.next = next;
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }
}
