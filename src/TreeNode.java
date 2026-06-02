public class TreeNode<T> {
    public T bleepbloop;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T bleepbloop) {
        this.bleepbloop = bleepbloop;
    }

    public TreeNode(T bleepbloop, TreeNode<T> left) {
        this.bleepbloop = bleepbloop;
        this.left = left;
    }

    public TreeNode(T bleepbloop, TreeNode<T> left, TreeNode<T> right) {
        this.bleepbloop = bleepbloop;
        this.left = left;
        this.right = right;
    }
}