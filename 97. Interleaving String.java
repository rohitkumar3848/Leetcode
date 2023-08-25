class Solution {
    public boolean helper(String s1,String s2,String s3,int i,int j,int k,int [][]dp){
        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }
        if(i+j==s3.length()){
            return true;
        }
        boolean x=false;
        if(i<s1.length()){
            if(s1.charAt(i)==s3.charAt(k)){
                x|=helper(s1,s2,s3,i+1,j,k+1,dp);
            }
        }
        if(j<s2.length()){
            if(s2.charAt(j)==s3.charAt(k)){
                x|=helper(s1,s2,s3,i,j+1,k+1,dp);
            }
        }
        dp[i][j]=x?1:0;
        return x;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(s1,s2,s3,0,0,0,dp);
    }
}
