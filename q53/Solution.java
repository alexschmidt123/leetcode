package q53;
import java.lang.Math;
class Solution {
    //double loops, high time complexity
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        for (int i =0; i<nums.length; i++){
            int current_sum = nums[i];
            max_sum = Math.max(current_sum,max_sum);
            if (i == nums.length-1){
                max_sum = Math.max(current_sum,max_sum);
                break;
            }else{
                for (int j = i+1; j<nums.length; j++){
                    current_sum = current_sum + nums[j];
                    max_sum = Math.max(current_sum,max_sum);
                }   
            }        
        }
        return max_sum;
    }
}
