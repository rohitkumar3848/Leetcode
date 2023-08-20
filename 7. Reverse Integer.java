class Solution {
    public int reverse(int x) {
        int rev=0;
        int num=Math.abs(x);
        while(num!=0){
            int d=num%10;
            if(rev>(Integer.MAX_VALUE-d)/10){
                return 0;
            }
            rev=(rev*10)+d;
            num=num/10;
        }
        if(x>=0){
            return rev;
        }
        else{
            return -rev;
        }
    }
}
