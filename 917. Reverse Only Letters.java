class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char ch[]=s.toCharArray();
        while(i<j){
            while(i<j && !Character.isLetter(ch[i])){
                i++;
            }
            while(i<j && !Character.isLetter(ch[j])){
                j--;
            }
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
