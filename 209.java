class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int sum = 0;
    int res = Integer.MAX_VALUE;
    int l=0 , r=0;
    while(r<nums.length){
        sum+= nums[r];
        while(l<=r && sum>= target){
            sum -=nums[l];
            res = Math.min(res,r-l+1);
            l++;
        }
        r++;

    }  
    if(res == Integer.MAX_VALUE) return 0; 
    return res;     
    }
}
