package q350;
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        List<Integer> nums2list = new ArrayList<Integer>(nums2.length);
        for (int k: nums2){
            nums2list.add(k);
        }
        for (int i= 0; i<nums1.length; i++){
            for (int j = 0; j<nums2list.size();j++){
                if (nums1[i] == nums2list.get(j)){
                    result.add(nums1[i]);
                    nums2list.remove(j);
                    break;
                }
            }
        }
        int[] result1 = new int[result.size()];
        for (int l=0; l<result.size(); l++){
            result1[l] = result.get(l);
        }
        return result1;
    }
}

