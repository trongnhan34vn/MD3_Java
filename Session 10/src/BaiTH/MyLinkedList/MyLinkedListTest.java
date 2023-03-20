package BaiTH.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("----------Test---------");
        MyLinkedList linkedList = new MyLinkedList(3);
        System.out.println(linkedList);
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst("Nhân");
        linkedList.add(2,9);
        System.out.println(linkedList);
//        linkedList.addFirst(4);
//        linkedList.addFirst(5);
        linkedList.printList();
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(Arrays.toString(arr.toArray()));
    }
}
