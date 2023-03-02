package q53;

class Test{
	public static void main(String[] args){
		int[] nums = {-1,0,-8};
		Solution solution = new Solution();
		int result = solution.maxSubArray(nums);
		System.out.println(result);
	}
}