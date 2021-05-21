class intersectionII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, k = 0;
        
        ArrayList<Integer> a = new ArrayList<>();
        while(i < n && j < m){
            
            if(nums1[i] == nums2[j]){
                a.add(nums1[i]);
                i++;
                j++;
            }
            
            else if(nums1[i] < nums2[j])
                i++;
            
            else 
                j++;
        }
        
        int [] ans = new int [a.size()];
        for(int l : a)
            ans[k++] = l;
        
        return ans;
    }
}
