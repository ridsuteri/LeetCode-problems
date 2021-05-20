class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int ans [] = new int [2*n];
        int x = 0, y = n; 
        for (int i = 0; i < 2*n ; ){
            ans[i++] = nums[x];
            x++;
            ans[i++] = nums[y];
            y++;    
        }
        
        return ans;
    }
}
