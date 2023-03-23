package BaiTap.Bai2;

public class Main {
    public static void main(String[] args) {
        BST<Integer> test = new BST<>();
        test.insert(3);
        test.insert(10);
        test.insert(34);
        test.insert(221);
        test.insert(20);
        test.insert(5);
        System.out.println("post order: ");
        test.postorder();
        System.out.println("\n");
        System.out.println("pre order: ");
        test.preorder();
        System.out.println("\n");
        System.out.println("in order: ");
        test.inorder();
    }
}
