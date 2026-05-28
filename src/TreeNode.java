public class TreeNode {
    public int bleepbloop;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int bleepbloop) {
        this.bleepbloop = bleepbloop;
    }

    public TreeNode(int bleepbloop, TreeNode left) {
        this.bleepbloop = bleepbloop;
        this.left = left;
    }

    public TreeNode(int bleepbloop, TreeNode left, TreeNode right) {
        this.bleepbloop = bleepbloop;
        this.left = left;
        this.right = right;
    }

    //TreeNode(8, null, TreeNode(5))
}