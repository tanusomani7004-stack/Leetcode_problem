class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int x : nums){
            mp.put(x, mp.getOrDefault(x,0)+1);
        }
        int res=Integer.MIN_VALUE;
        int count =0;
        for (Map.Entry<Integer,Integer>x:mp.entrySet()){
            if(x.getValue()>res){
                res =x.getValue();
            }
        }
        for (Map.Entry<Integer,Integer>x:mp.entrySet()){
            if(x.getValue() == res){
                count+=x.getValue();
            }
        }
        return count;
    }
}
