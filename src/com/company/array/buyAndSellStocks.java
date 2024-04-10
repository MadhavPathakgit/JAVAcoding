package com.company.array;

public class buyAndSellStocks {
    public static int buyAndSellStocks(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                 int profit = prices[i]-buyPrice; //today profit
                 maxProfit =  Math.max(maxProfit,profit);// global profit
            }
            else{
                buyPrice = prices[i];


            }
        }
        return maxProfit;
    }
    public static void main( String[] args ) {
        int [] price = {7,1,5,3,6,4};
      int maxProfit =   buyAndSellStocks( price );
        System.out.println("the maximum profit is : "+maxProfit);
    }
}
