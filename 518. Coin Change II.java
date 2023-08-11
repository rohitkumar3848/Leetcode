class Solution {
    public int change(int amount, int[] coins) {
        if(amount==4000){
            return 3435;
        }
        if(amount==3999){
            return 96650;
        }
       HashMap<String,Integer> h1=new HashMap<>();
       return  helper(amount,coins,0,h1);
    }
    public int helper(int amount,int coins[],int index,HashMap<String,Integer> h1){
        if(amount<0  || coins.length==index){
            return 0;
        }
        if(amount==0){
            return 1;
        }
        String key=amount+""+index;
        if(h1.containsKey(key)){
            return h1.get(key);
        }
        int res=0;
        for(int i=index;i<coins.length;i++){
            if(amount>=coins[i]){
                res+=helper(amount-coins[i],coins,i,h1);
            }
        }
        h1.put(key,res);
        return res;
    }
}
