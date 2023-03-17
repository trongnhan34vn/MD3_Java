import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Scanner sc = new Scanner(System.in);
//        int n1 = 0;
//        while (n1 < 20) {
//            if (n1 % 2 == 0) {
//                System.out.print(n1 + "-");
//            }
//            n1++;
//        }
//
//        for (; n1 < 100; n1++) {
//            if (n1 % 2 == 0) {
//                System.out.println(n1 + ", ");
//            }
//        }
        testLink();
//        test();
    }

    public static void test () {
        List<String>arrayList = new ArrayList<>();
        arrayList.add("Nhân");
        arrayList.add("Khoa");
        arrayList.add("pikachu");
        System.out.println(arrayList);
    }

    public static void testLink () {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Tùng Tic");
        linkedList.add("Pikachu");
        linkedList.add("Khoa");

        ListIterator<String> listIterator = linkedList.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.print(listIterator.next() + " ");
//        }
        System.out.println(listIterator);
    }
}