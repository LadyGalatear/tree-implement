public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);

    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);

    TreeNode<String> stringRoot = new TreeNode<>("my hero");
    stringRoot.left = new TreeNode<>("yayayay");
    stringRoot.left.left = new TreeNode<>("mmmmrrr");
    stringRoot.left.right = new TreeNode<>("body horror is awesome");

    stringRoot.right = new TreeNode<>("ZA WARUDO");
    stringRoot.right.left = new TreeNode<>("wryyyyy");
    stringRoot.right.right = new TreeNode<>("oraoraora");
    stringRoot.right.right.right = new TreeNode<>("mudamudamuda");

    // preorder(stringRoot);
    // postorder(root);
    // inorder(root);
    // printGreaterThan(root, 9);
    System.out.println(countNodes(stringRoot));
  }

  public static int countNodes(TreeNode<?> current) {
    if (current == null) return 0;
    return 1 + countNodes(current.left) + countNodes(current.right);
  }

  public static void printGreaterThan(TreeNode<Integer> current, int threshold) {
    if (current == null) return;

    if (current.bleepbloop > threshold) {
      System.out.println(current.bleepbloop);
    }

    printGreaterThan(current.left, threshold);
    printGreaterThan(current.right, threshold);
  }

  // public static void preorder(TreeNode<?> current)
  // public static <E> void preorder(TreeNode<E> current)

  public static void preorder(TreeNode<?> current) {
    if (current == null) return;

    System.out.println(current.bleepbloop);
    preorder(current.left);
    preorder(current.right);
  }

  public static void postorder(TreeNode<?> current) {
    if (current == null) return;

    postorder(current.left);
    postorder(current.right);
    System.out.println(current.bleepbloop);
  }

  public static void inorder(TreeNode<?> current) {
    if (current == null) return;

    postorder(current.left);
    System.out.println(current.bleepbloop);
    postorder(current.right);
  }
}