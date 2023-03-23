package BaiTap.Bai2;

public abstract class AbstractTree<E> implements Tree<E> {

    public abstract void preorder();
    @Override
    public void postorder(TreeNode<E> root){};

    public abstract void postorder();
    @Override
    public void preorder(TreeNode<E> root){};

}
