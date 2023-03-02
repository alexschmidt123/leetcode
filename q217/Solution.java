package q217;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1) return false;
        int min=nums[0],max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(min>nums[i]) {
                min=nums[i];
                continue;
            }
            if(max<nums[i]){
                max=nums[i];
                continue;
            }
            for (int j = 0; j < i; j++) {
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
}

