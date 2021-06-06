class Solution {
    public int longestConsecutive(int[] nums) {
        Set set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int maxValue = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (!set.contains(cur - 1)) {

                int temp = cur + 1;
                while (set.contains(temp)) {
                    temp++;
                }

                maxValue = maxValue > (temp - cur) ? maxValue : temp - cur;
            }
        }

        return maxValue;
    }
}
