class Solution {
    public int maxProfit(int[] prices) {
        // Brute force
        int max=0,n=prices.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                max=Math.max((prices[j]-prices[i]),max);
            }
        }
        return max;
    }
}
