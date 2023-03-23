package BaiTap.Bai2;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {

    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

    @Override
    public void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        // Travel the left sub-tree first.
        postorder(root.left);
        // Travel the right sub-tree next.
        postorder(root.right);
        // Print the current node value
        System.out.print(" " + root.element);
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    @Override
    public void preorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        // Print the current node value
        System.out.print(" " + root.element);
        // Travel the left sub-tree first.
        preorder(root.left);
        // Travel the right sub-tree next.
        preorder(root.right);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }
}
