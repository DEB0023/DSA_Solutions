class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        int n=prices.length;
        for(int i=1;i<n;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
            }
            int currentprofit=prices[i]-buy;
            if(currentprofit>profit)
            {
                profit=currentprofit;
            }
                }
                  return profit;

    }
}