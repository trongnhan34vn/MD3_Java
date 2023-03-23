package BaiTap.Bai2;

public interface Tree<E> {
    boolean insert(E e);
    void inorder();

    void preorder();
    void postorder(TreeNode<E> root);

    void postorder();

    void preorder(TreeNode<E> root);

    int getSize();
}
