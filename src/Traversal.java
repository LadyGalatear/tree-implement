public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(10);

    root.left = new TreeNode<Integer>(9);
    root.left.left = new TreeNode<Integer>(5);
    root.left.right = new TreeNode<Integer>(2);

    root.right = new TreeNode<Integer>(15);
    root.right.left = new TreeNode<Integer>(-3);
    root.right.right = new TreeNode<Integer>(5);
    root.right.right.right = new TreeNode<Integer>(22);

    // preorder(root);
    // postorder(root);
    // inorder(root);
    printGreaterThan(root, 0);
  }

  public static void printGreaterThan(TreeNode<Integer> current, int threshold) {
    if (current == null) return;

    if (current.bleepbloop > threshold) {
      System.out.println(current.bleepbloop);
    }

    printGreaterThan(current.left, threshold);
    printGreaterThan(current.right, threshold);
  }

  public static void preorder(TreeNode<Integer> current) {
    if (current == null) return;

    System.out.println(current.bleepbloop);
    preorder(current.left);
    preorder(current.right);
  }

  public static void postorder(TreeNode<Integer> current) {
    if (current == null) return;

    postorder(current.left);
    postorder(current.right);
    System.out.println(current.bleepbloop);
  }

  public static void inorder(TreeNode<Integer> current) {
    if (current == null) return;

    postorder(current.left);
    System.out.println(current.bleepbloop);
    postorder(current.right);
  }
}