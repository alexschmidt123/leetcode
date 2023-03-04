package q350;
import java.util.*;

class Test{
	public static void main(String[] args){
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		Solution solution = new Solution();
		int[] result = solution.intersect(nums1,nums2);
		System.out.println(Arrays.toString(result));
	}
}