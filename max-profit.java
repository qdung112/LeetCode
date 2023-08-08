public int maxProfit(int[] prices) {
        int sell = 0;
        int buy = prices[0];
        for(int i = 1; i < prices.length; i ++){
            buy = Math.min(buy,prices[i]);
            sell = Math.max(sell,prices[i]-buy);
        }
        return sell;
    }
