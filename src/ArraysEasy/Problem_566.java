package ArraysEasy;

import java.util.ArrayList;
import java.util.List;

public class Problem_566 {
    public static void main(String[] args) {
        matrixReshape(new int[][]{{1,2},{3,4}},1,4);
    }

    private static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row=nums.length,col=nums[0].length,index = 0 ;
        List values = new ArrayList();
        int[][] matrix = new int[r][c];
        if (r*c == row*col){
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    values.add(nums[i][j]);
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j]= (int) values.get(index);
                    index++;
                }
            }
            return matrix;
        }else{
            return nums;
        }
    }
}
