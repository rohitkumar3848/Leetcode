class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder s1=new StringBuilder();
        for(String w:words){
            s1.append(w.charAt(0));
        }
        return s1.toString().equals(s);
    }
}
