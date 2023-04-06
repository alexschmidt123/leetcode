package q566;
import java.util.*;

class Test{
	public static void main(String[] args){
		int[][] mat = {{2,3,4},{5,6,7}};
		int r= 3; int c= 2;
		Solution solution = new Solution();
		int[][] result = solution.matrixReshape(mat,r,c);
		for (int i = 0; i<result.length; i++){
			System.out.println(Arrays.toString(result[i]));
		}
	}
}