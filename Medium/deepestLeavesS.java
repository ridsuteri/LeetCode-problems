class deepestLeavesS {
    class Pair{
        int data; 
        int height;
        Pair(int data, int height){
            this.data = data; 
            this.height = height;
        }
    }
    
    public Pair _deepestLeavesSum(TreeNode root){
        if(root == null) return new Pair(0,0);
        if(root.left == null && root.right == null){
            return new Pair(root.val, 1);
        }
        Pair left = _deepestLeavesSum(root.left);
        Pair right = _deepestLeavesSum(root.right);
        if(left.height > right.height) return new Pair(left.data, left.height + 1);
        if(left.height < right.height) return new Pair(right.data, right.height + 1);
        return new Pair(right.data + left.data, left.height + 1);
    }
    
    public int deepestLeavesSum(TreeNode root) {
        Pair left = _deepestLeavesSum(root.left);
        Pair right = _deepestLeavesSum(root.right);
        if(left.height > right.height) return left.data;
        if(left.height < right.height) return right.data;
        return left.data + right.data;
    }
}
