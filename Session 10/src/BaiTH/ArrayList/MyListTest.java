package BaiTH.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> listInterger = new MyArrayList<>();
        for (int i = 1; i < 6; i++) {
            listInterger.add(i);
        }

        System.out.println("Element 4 -->" + listInterger.get(4));
        System.out.println("Element 2 -->" + listInterger.get(2));
        System.out.println("Element 2 -->" + listInterger.get(1));
////        listInterger.get(6);
//        System.out.println("Element 2 -->" + listInterger.get(6));

        listInterger.get(-1);
    }
}
