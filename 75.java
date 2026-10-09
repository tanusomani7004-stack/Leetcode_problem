class Solution {
    public void sortColors(int[] nums) {
        int t =0;
        for( int i=0; i<nums.length;i++){
            if(nums[i] != 2){
                int temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
                t++;
            }
        }
        t=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] ==2) break;
            if(nums[i] !=1){
                int temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
                t++;
            }
        }
    }
}
