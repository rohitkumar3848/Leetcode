class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> a1=new ArrayList<>();
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                if(a1.contains(count)){
                    return false;
                }
                else{
                    a1.add(count);
                    count=1;
                }
            }
        }
        if(a1.contains(count)){
            return false;
        }
        return true;
    }
}
