class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store sorted string and ArrayList of Strings that can be a anagram to the sorted String.
        Map<String,List<String>> mp=new HashMap<>();
        // Iterate through each String in strs[]
        for(String s:strs){
            // Convert each string to char array
            char[] c=s.toCharArray();
            // create a chars count array
            int[] count=new int[26];
            // for each character in char array increment the count of that char at its index
            for(char ch1:c){
                count[ch1-'a']++;
            }
            // convert the count array to String
            String s1=Arrays.toString(count);
            // 
            //mp.putIfAbsent(s1, new ArrayList<>());
            if(!mp.containsKey(s1)) mp.put(s1,new ArrayList<>());
            mp.get(s1).add(s);
        }
        return  new ArrayList<>(mp.values());
    }
}
