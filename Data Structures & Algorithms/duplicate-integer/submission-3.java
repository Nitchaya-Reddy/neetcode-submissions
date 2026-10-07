class Solution {
    public boolean hasDuplicate(int[] nums) {
        //HashSet
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}