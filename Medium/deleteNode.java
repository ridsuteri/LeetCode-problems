class deleteNode {

		private TreeNode remove(TreeNode node, int n) {
			if (node == null) {
				return null;
			}

			if (n > node.val) {
				node.right = remove(node.right, n);
			} else if (n < node.val) {
				node.left = remove(node.left, n);
			} else {
				if (node.left == null && node.right == null) {
					return null;
				} else if (node.left != null && node.right == null) {
					return node.left;
				} else if (node.left == null && node.right != null) {
					return node.right;
				} else {
					node.val = max(node.left);
					node.left = remove(node.left, node.val);
					return node;
				}
			}

			return node;
		}

    private int max(TreeNode parent) {

			if (parent == null) {
				return 0;
			}
			if (parent.right != null) {
				return max(parent.right);
			} else {
				return parent.val;
			}
		}
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
				return null;
			}

			if (key > root.val) {
				root.right = remove(root.right, key);
			} else if (key < root.val) {
				root.left = remove(root.left, key);
			} else {
				if (root.left == null && root.right == null) {
					return null;
				} else if (root.left != null && root.right == null) {
					return root.left;
				} else if (root.left == null && root.right != null) {
					return root.right;
				} else {
					root.val = max(root.left);
					root.left = remove(root.left, root.val);
					return root;
				}
			}

			return root;
    }
}
