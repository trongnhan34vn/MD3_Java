package BaiTap.Bai3_4_5;

public class Main {
    public static void main(String[] args) {
        BST<Integer> test = new BST<>();
        test.insert(2);
        test.insert(10);
        test.insert(22);
        test.insert(24);
        test.insert(90);
        test.insert(11);
        test.insert(5);
        System.out.println("Trước khi xoá: ");
        test.preorder();
        System.out.println("\n");
        test.delete(10);
        System.out.println("Sau khi xoá: ");
        test.preorder();
        System.out.println("\n");
        System.out.println(test.search(3));
    }
}
