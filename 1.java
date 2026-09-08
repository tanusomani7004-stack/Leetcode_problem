class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0; i<nums.length;i++){
            int diff = target - nums[i];

            if(mp.containsKey(diff))  return new int[]{mp.get(diff) , i};

            mp.put(nums[i] , i) ;
        }

        return new int  [] {};
    }
}

//hashmap  means dictonary
// to add we use put method
// to get any value mp.getvalue()   , mp.getkey()   for searching mp.containkey()    
//get and default 
// mp.getOrDefault(val,(val,0)+1)
