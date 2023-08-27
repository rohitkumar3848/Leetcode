class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> h1=new HashMap<>();
        for(int i=0;i<stones.length;i++){
            h1.put(stones[i],new HashSet<>());
        }
        h1.get(stones[0]).add(1);
        for(int i=0;i<stones.length;i++){
            int cur=stones[i];
            HashSet<Integer> jumps=h1.get(cur);
            for(int jump : jumps){
                int pos=cur+jump;
                if(pos==stones[stones.length-1]){
                    return true;
                }
                if(h1.containsKey(pos)){
                    if(jump-1>0){
                        h1.get(pos).add(jump-1);
                    }
                    h1.get(pos).add(jump);
                    h1.get(pos).add(jump+1);
                }
            }
        }
        return false;
    }
}
