class kthLargest {
   // quick select algorithm
    public int partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(nums[j]>=pivot){ // descending order
                // swap i+1 and j
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        // j reached to high 
        // swap i+1 and pivot index
        // all elements greater than (i+1)th index is less than pivot
        // and all elements less than (i+1)th index is greater than pivot
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;
        return (i+1); // new pivot
    }
    public int quickSelect(int[] nums, int low, int high, int k){
        int pivot = partition(nums, low, high);
        if(pivot==k){
            // kth largest found
            return nums[pivot];
        }
        if(k > pivot)
            return quickSelect(nums, pivot+1, high, k);
        return quickSelect(nums, low, pivot-1, k);

    }
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length-1, k-1);
    }
}
