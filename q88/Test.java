package q88;
import java.util.Arrays;
class Test{
	public static void main(String[] args){
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6}; 
		int n = 3;
		Solution solution = new Solution();
		solution.merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}
}