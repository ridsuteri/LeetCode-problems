class maxProductSubArr {
    public int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int maxOverall = nums[0];
        int prevMaxSoFar = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            prevMaxSoFar = maxSoFar;
            
            maxSoFar = Math.max(nums[i], Math.max(nums[i]*maxSoFar, nums[i]*minSoFar));
            
            minSoFar = Math.min(nums[i], Math.min(nums[i]*minSoFar, prevMaxSoFar*nums[i]));
            
            maxOverall = Math.max(maxOverall, maxSoFar);
        }
       return maxOverall;
    }
}
