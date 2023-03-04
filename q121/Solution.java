package q121;

class Solution {
  public int maxProfit(int[] prices) {
    if (prices.length==1){
      return 0;
    }
    int min = prices[0];
    int output =0;
    for (int i=1; i<prices.length; i++){
      if (prices[i]<min){
        min = prices[i];
      }
      else if(output < prices[i]-min){
        output = prices[i] -min;
      }
    }
    return output;
  }
}