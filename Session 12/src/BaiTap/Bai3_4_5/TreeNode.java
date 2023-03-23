package BaiTap.Bai3_4_5;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
