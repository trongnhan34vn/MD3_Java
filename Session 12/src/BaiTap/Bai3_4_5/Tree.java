package BaiTap.Bai3_4_5;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();

    void preorder();
    void postorder(TreeNode<E> root);

    void postorder();

    void preorder(TreeNode<E> root);

    int getSize();
    void delete(E value);
}
