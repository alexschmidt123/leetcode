package q1;

import java.util.HashMap;
import java.util.Map;

class Solution{
  // public int[] twoSum(int[] nums, int target) {
  //   int[] ans=new int[2];
  //   for(int i=0;i<nums.length;i++){
  //       for(int j=(i+1);j<nums.length;j++){
  //           if(nums[i]+nums[j]==target){
  //               ans[0]=i;
  //               ans[1]=j;
  //               return ans;
  //             }
  //           }
  //   }
  //   return ans; 
  // }

  public int[] twoSum(int[] nums, int target){
    Map<Integer, Integer> map = new HashMap();
    for (int i = 0; i<nums.length; i++){
      int remaining = target - nums[i];
      if (map.containsKey(remaining)){
        return new int[] {map.get(remaining), i};
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("desired pair of numbers not found");
  }
}