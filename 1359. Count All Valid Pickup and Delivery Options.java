class Solution {
    public int countOrders(int n) {
        long ans=1;
        int mod=1000000007;
        long x=2*n;
        for(int i=1;i<=n;i++){
            ans=(ans*((x*(x-1))/2))%1000000007;
            x-=2;
        }
        return (int)ans;
    }
}
