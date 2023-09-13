class Solution {
    public int candy(int[] arr) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,1);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
              dp[i]=dp[i-1]+1;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
          if(arr[i]>arr[i+1]){
              dp[i]=Math.max(dp[i],dp[i+1]+1);
            }
        }
        int sum=0;
        for(int ele:dp){
            sum+=ele;
        }
        return sum;
    }
}
