class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a1=new ArrayList<>();
        int n=nums.length/3;
        int n1=-1,n2=-1;
        int count1=0,count2=0;
        for(int ele:nums){
            if(n1==ele){
                count1++;
            }
            else if(n2==ele){
                count2++;
            }
            else if(count1==0){
                n1=ele;
                count1=1;
            }
            else if(count2==0){
                n2=ele;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int ele:nums){
            if(ele==n1){
                count1++;
            }
            else if(ele==n2){
                count2++;
            }
        }
        if(count1>n){
            a1.add(n1);
        }
        if(count2>n){
            a1.add(n2);
        }
        return a1;
    }
}
