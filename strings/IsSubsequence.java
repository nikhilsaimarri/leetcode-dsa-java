class Solution {
    public boolean isSubsequence(String s, String t) {
        int l = 0;
        int r = 0;
        while(r<t.length() && l<s.length()){
            if(s.charAt(l)==t.charAt(r)){
                l++;
            }
            r++;
        }
        if(l==s.length()){
            return true;
        }
        return false;
        
    }
}
