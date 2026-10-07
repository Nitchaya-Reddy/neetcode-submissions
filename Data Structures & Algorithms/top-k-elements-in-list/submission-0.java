class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            arr.add(entry.getKey());
        }
        arr.sort((a,b)->mp.get(b)-mp.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}
