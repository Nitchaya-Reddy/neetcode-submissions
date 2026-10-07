class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(mp.containsKey(x)) return new int[]{mp.get(x),i};
            mp.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
