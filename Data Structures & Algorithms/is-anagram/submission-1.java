class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charCount=new int[26];
        int n=s.length(),m=t.length();
        for(int i=0;i<n;i++){
            charCount[s.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++){
            charCount[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(charCount[i]!=0) return false;
        }
        return true;
    }
}
