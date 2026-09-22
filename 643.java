class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l =0 , r=0;
        double sum =0;
        double res =Double.NEGATIVE_INFINITY;
        while (r<nums.length){
            sum += nums[r];


            if(r-l+1>k){
                sum -= nums[l];
                l++;
            }
            if (r-l+1 == k){
                res = Math.max(res,sum/k);

            }
            r++;
        }
        return res;
    }
}
