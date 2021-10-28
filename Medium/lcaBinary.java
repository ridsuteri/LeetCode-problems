class lcaBinary {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        
        if(root.val == p.val)
            return p;
        
        if(root.val == q.val)
            return q;
        
        TreeNode n1 = lowestCommonAncestor(root.left,p,q);
        TreeNode n2 = lowestCommonAncestor(root.right,p,q);
        
        if(n1 == null && n2 == null)
            return null;
        
        else if(n1 == null && n2 != null)
            return n2;
        
        else if(n2 == null && n1 != null)
            return n1;
        
        else 
            return root;
            
    }
}
