class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            int[] count=new int[26];
            for(char ch1:c){
                count[ch1-'a']++;
            }
            String s1=Arrays.toString(count);
            mp.putIfAbsent(s1, new ArrayList<>());
            mp.get(s1).add(s);
        }
        return  new ArrayList<>(mp.values());
    }
}
