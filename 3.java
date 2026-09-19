class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int l=0;
        int r=0;
        int res=Integer.MIN_VALUE;
        String ans="";
        Set<Character> st=new HashSet<>();
        while (r<s.length()){
            if(!st.contains(s.charAt(r))){
                ans+=s.charAt(r);
                st.add(s.charAt(r));
                int n=ans.length();
                res=Math.max(res,n);
                r++;
            }
            else{
                ans=ans.substring(1);
                st.remove(s.charAt(l));
                l++;
            }
        }
        return res;
    }
}
