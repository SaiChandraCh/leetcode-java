public class Problem_807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int len = grid.length,sum = 0;
        int[] subArray1 = new int[len];

//        left to right
        int i = 0,max = 0;
        for (int[] temp : grid) {
            max = 0;
            for (int t : temp) {
                if(t > max){
                    max=t;
                }
            }
            subArray1[i++] = max;
        }
//        top to bottom
        int[] subArray2 = new int[len];
        for (int j = 0; j < len; j++) {
            max = 0;
            for (int k = 0; k < len; k++) {
                if(grid[k][j]>max){
                    max = grid[k][j];
                }
            }
            subArray2[j] = max;
        }
        for (int j = 0; j < len; j++) {
            for (int k = 0; k < len; k++) {
                sum = sum + Integer.min(subArray1[j],subArray2[k])-grid[j][k];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem_807 problem_807 = new Problem_807();
        problem_807.maxIncreaseKeepingSkyline(new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}});
    }
}
