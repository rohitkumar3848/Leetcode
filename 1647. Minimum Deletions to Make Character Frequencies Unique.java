class Solution {
    public int minDeletions(String s) {
       HashMap<Character,Integer> h1=new HashMap<>();
       char []ch=s.toCharArray();
       for(char ele:ch){
           h1.put(ele,h1.getOrDefault(ele,0)+1);
       } 
       HashSet<Integer> h2=new HashSet<>();
       int del=0;
       for(int ele:h1.values()){
           while(ele>0 && h2.contains(ele)){
               ele--;
               del++;
           }
           h2.add(ele);
       }
       return del;
    }
}
