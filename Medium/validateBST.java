class validateBST {
  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return false;
    }
    if ((root.val == Integer.MIN_VALUE && root.left != null) || (root.val == Integer.MAX_VALUE && root.right != null)) {
      return false;
    }
    return isValidBST(root.left, Integer.MIN_VALUE, root.val - 1) 
      && isValidBST(root.right, root.val + 1, Integer.MAX_VALUE);
  }
  
  // min and max are inclusive
  private boolean isValidBST(TreeNode node, int min, int max) {
    if (node == null) {
      return true;
    }
    if (node.val < min || node.val > max) {
      return false;
    }
    if ((node.val == Integer.MIN_VALUE && node.left != null) || (node.val == Integer.MAX_VALUE && node.right != null)) {
      return false;
    }
    return isValidBST(node.left, min, node.val - 1) 
      && isValidBST(node.right, node.val + 1, max);
  }
}
