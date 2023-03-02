package q217;

class Test{
	public static void main(String[] args){
		int[] nums = {1,4,7,9,0,8,12};
		Solution solution = new Solution();
		boolean result = solution.containsDuplicate(nums);
		System.out.println(result);
	}
}