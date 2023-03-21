package BaiTH.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("----------Test---------");
        MyLinkedList linkedList = new MyLinkedList(3);
//        System.out.println(linkedList);
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.add(2,9);
        linkedList.addLast(7);
        linkedList.addLast(10);
        linkedList.printList();
        System.out.println("size ----> " + linkedList.size());
        linkedList.remove(9);
        linkedList.printList();
        Node newList = linkedList.clone();
        System.out.println(newList);
        linkedList.getFirst();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
//        linkedList.clear();
//        linkedList.printList();
//        System.out.println(linkedList);
    }
}
