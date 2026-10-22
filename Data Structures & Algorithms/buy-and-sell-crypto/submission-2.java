class Solution {
    public int maxProfit(int[] prices) {
        // Using two pointers
        int max=0,n=prices.length,b=0,s=1;
        while(s<n){
            if(prices[s]>prices[b]){
                max=Math.max(prices[s]-prices[b],max);
                s++;
            }
            else{
                b=s;
                s++;
            }
        }
        return max;
    }
}
