public class sortColors {
        public void sortColors(int[] nums) {
            
            int nextZero =0, nextTwo = nums.length-1,i=0;
            
            while(i <= nextTwo){
                
                if(nums[i] == 2){
                    swap(i, nextTwo, nums);
                    nextTwo--;
                }
                
                else if(nums[i] == 0){
                    swap(i, nextZero, nums);
                    nextZero++;
                    i++;
                }
                
                else
                    i++;
            }
                
        }
        
        public void swap(int a , int b, int[] arr){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
}
