class majorityEleII {
    public List<Integer> majorityElement(int[] nums) {
     
        int n = nums.length;
        List<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        if(n == 0)
            return ans;
        
        for(int i : nums){
            if(!map.containsKey(i))
                map.put(i,1);
            
            else
                 map.put(i, map.get(i) + 1);
        }
        
        for(Map.Entry mapElement : map.entrySet()){
            // System.out.println((int)mapElement.getValue());
            if((int)mapElement.getValue() > n/3)
                ans.add((int)mapElement.getKey());
        }
        
        return ans;
    }
}
