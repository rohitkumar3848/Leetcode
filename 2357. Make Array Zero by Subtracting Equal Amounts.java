class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:nums){
            if(ele==0){
                continue;
            }
            pq.add(ele);
        }
        int count=0;
        int sum=0;
        while(pq.size()>0){
            int min=pq.poll();
            count++;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[i]=nums[i]-min;
                }
            }
            for(int x:nums){
                sum+=x;
            }
            if(sum==0){
                return count;
            }
            pq.clear();
            for(int ele:nums){
                if(ele==0){
                    continue;
                }
                pq.add(ele);
            }
        }
        return count;
    }
}
