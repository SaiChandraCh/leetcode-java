public class Problem_766 {
    public static void main(String[] args) {
        System.out.println(toeplitz(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
    }

//    1234 ==> 00 01 02 03
//    5123 ==> 10 11 12 13
//    9512 ==> 20 21 22 23

    private static boolean toeplitz(int[][] matrix) {
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[0].length-1; j++) {
                System.out.println(i+" "+j+" => "+(i+1)+(j+1));
                if (matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }

}
