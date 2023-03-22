package BaiTH.MyLinkedList;

import java.util.Arrays;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(int data) {
        head = new Node(data);
    }

//    private class Node {
//        private Node next;
//        private Object data;
//
//        public Node(Object data) {
//            this.data = data;
//        }
//
//        public Object getData() {
//            return this.data;
//        }
//
//        @Override
//        public String toString() {
//            return "Node{" +
//                    "next=" + next +
//                    ", data=" + data +
//                    '}';
//        }
//    }

    public void add(int index, int data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(int data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(int data) {
        Node temp = head;
        System.out.println("temp -----> " + temp);
        Node node = new Node(data);
        System.out.println("head -----> " + head);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        numNodes++;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

//    public E remove(int index) {
//        if (index < 0 && index < size()) {
//            throw new IndexOutOfBoundsException();
//        }
//        Node temp = head;
//        for (int i = 0; i < index - 1 && temp.next != null; i++) {
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        return (E) head;
//    }

    public boolean remove(Object e) {
        Node temp = head;
        Node nodeDel = new Node();
        nodeDel.setData(e);
        boolean check = false;
        while (temp.next != null) {
            if (temp.next.getData() == nodeDel.getData()) {
                temp.next = temp.next.next;
                check = true;
            }
            temp = temp.next;
        }
        return check;
    }

    public Node clone() {
        Node temp = head;    // used to iterate over the original list
        Node newList = null;    // head of the new list
        Node tail = null;       // point to the last node in a new list

        while (temp != null) {
            // special case for the first new node
            if (newList == null) {
                newList = new Node(null, temp.getData());
                tail = newList;
            } else {
                tail.next = new Node();
                tail = tail.next;
                tail.setData(temp.getData());
                tail.next = null;
            }
            temp = temp.next;
        }
        return newList;
    }

    public void clear() {
        head = null;
    }

    public E getFirst() {
        if (head != null)
            return (E) head.getData();
        else
            throw new java.util.NoSuchElementException("List is empty");
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", numNodes=" + numNodes +
                '}';
    }
}
