class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int count[]=new int[n];
        int res[][]=new int[n][n];
        for(int []road:roads){
            count[road[0]]++;
            count[road[1]]++;
            res[road[0]][road[1]]=1;
            res[road[1]][road[0]]=1;
        }
        int rank=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                rank=Math.max(rank,count[i]+count[j]-res[i][j]);
            }
        }
        return rank;
    }
}
