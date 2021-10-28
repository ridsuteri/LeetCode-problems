class zigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        int n = 1;
        while(!q.isEmpty())
        {
            int level = q.size();
            List<Integer> levelNodes = new ArrayList<>();
            for(int i = 0;i<level ;i++)
            {
                TreeNode cur = q.remove();
                levelNodes.add(cur.val);
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
                
            }
            if(n%2==0)
                Collections.reverse(levelNodes);
            res.add(levelNodes);
            n++;
        }
        
        return res;
        
    }
}
