class Solution {
    public int[] productExceptSelf(int[] nums) {
        int suffix=1,n=nums.length;
        int[] product=new int[n];
        int zero_ct=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                zero_ct++;
                continue;
            }
            suffix=suffix*nums[i];
        }
        if(zero_ct>1) return product;
        for(int i=0;i<n;i++){
            if(zero_ct==1){
                if(nums[i]!=0) product[i]=0;
                else product[i]=suffix;
            }
            else product[i]=suffix/nums[i];
        }
        return product;
    }
}  
