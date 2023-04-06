package q566;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] res = new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                int y = (i*c+j+1)%(mat[0].length)-1;
                if (y ==-1) {y = mat[0].length-1;}
                int x = (i*c+j+1-y)/mat[0].length;
                //System.out.println(x+" "+y);
                res[i][j] = mat[x][y];
            }
        }
        return res;
    }
}