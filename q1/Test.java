package q1;

class Test{
	public static void main(String[] args){
		int[] nums = {1,4,7,9,0,8,12};
		int target = 11;
		Solution solution = new Solution();
		int[] result = solution.twoSum(nums,target);
		System.out.println("["+result[0] +", " + result[1]+"]");
	}
}