import java.util.*;
class minimizeMaxPairSum{
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0, j = n - 1; i <= j; i++, j--){
            int sum = nums[i]+nums[j] ; 
            if(sum > max)
                max = sum;
        }
        return max;
    }
}
