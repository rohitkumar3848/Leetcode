class Solution {
    public String sortVowels(String s) {
        char arr[]=s.toCharArray();
        int count=0;
        for(char c:arr){
            if(isVowel(c)){
                count++;
            }
        }
        char vow[]=new char[count];
        int k=0;
        for(char c:arr){
            if(isVowel(c)){
                vow[k++]=c;
            }
        }
        Arrays.sort(vow);
        k=0;
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i]=vow[k++];
            }
        }
        return String.valueOf(arr);
    }
    public boolean isVowel(char c){
        return c=='A'|| c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
