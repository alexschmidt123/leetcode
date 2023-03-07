package q4;

class Test{
	public static void main(String[] args){
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		Solution solution = new Solution();
		double result = solution.findMedianSortedArrays(nums1,nums2);
		System.out.println(result);
	}
}