public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);

    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);

    // preorder(root);
    // postorder(root);
    inorder(root);
  }

  public static void printGreaterThan(TreeNode current, int threshold) {
    if (current == null) return;

    if (current.bleepbloop > threshold) {
      System.out.println(current.bleepbloop);
    }

    printGreaterThan(current.left, threshold);
    printGreaterThan(current.right, threshold);
  }

  public static void preorder(TreeNode current) {
    if (current == null) return;

    System.out.println(current.bleepbloop);
    preorder(current.left);
    preorder(current.right);
  }

  public static void postorder(TreeNode current) {
    if (current == null) return;

    postorder(current.left);
    postorder(current.right);
    System.out.println(current.bleepbloop);
  }

  public static void inorder(TreeNode current) {
    if (current == null) return;

    postorder(current.left);
    System.out.println(current.bleepbloop);
    postorder(current.right);
  }
}