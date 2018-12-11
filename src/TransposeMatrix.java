public class TransposeMatrix {
    public static void main(String[] args) {
        transpose(new int[][]{{5},{8}});//{{1,2,3},{4,5,6},{7,8,9}});
    }

//    123 147 ==> 00 01 02 00 10 20
//    456 258 ==> 10 11 12 01 11 21
//    789 369 ==> 20 21 22 02 12 22

    private static int[][] transpose(int[][] A) {
        int[][] transpose = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                transpose[j][i] = A[i][j];
            }
        }
//        for (int i = 0; i < length; i++) {
//            System.out.println(transpose[i][i]+" "+transpose[i][i+1]+" "+transpose[i][i+2]);
//        }
        return transpose;
    }
}
