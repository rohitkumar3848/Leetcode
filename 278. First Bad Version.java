public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1){
            return 1;
        }
        int l=1;
        while(l<n){
            int mid=l+(n-l)/2;
            if(isBadVersion(mid)){
                n=mid;
            }
            else{
                l=mid+1;
            }
        }
      return l;  
    }
}
