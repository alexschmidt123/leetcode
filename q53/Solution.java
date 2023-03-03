package q53;

import java.lang.Math;

class Solution {
    // double loops, high time complexity
    // public int maxSubArray(int[] nums) {
    // int max_sum = nums[0];
    // for (int i = 0; i < nums.length; i++) {
    // int current_sum = nums[i];
    // max_sum = Math.max(current_sum, max_sum);
    // if (i == nums.length - 1) {
    // max_sum = Math.max(current_sum, max_sum);
    // break;
    // } else {
    // for (int j = i + 1; j < nums.length; j++) {
    // current_sum = current_sum + nums[j];
    // max_sum = Math.max(current_sum, max_sum);
    // }
    // }
    // }
    // return max_sum;
    // }

    // public int maxSubArray(int[] nums) {
    // int pre = 0;
    // int res = nums[0];
    // for (int num : nums) {
    // pre = Math.max(pre + num, num);
    // res = Math.max(res, pre);
    // }
    // return res;
    // }

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        // dp[i] 表示：以 nums[i] 结尾的连续子数组的最大和
        int[] dp = new int[len];
        dp[0] = nums[0];

        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }

        // 也可以在上面遍历的同时求出 res 的最大值，这里我们为了语义清晰分开写，大家可以自行选择
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
