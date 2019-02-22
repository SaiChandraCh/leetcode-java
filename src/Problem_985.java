public class Problem_985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[A.length];
        return helper(A,queries,0,result);
    }

    private int[] helper(int[] a, int[][] queries, int index, int[] result) {
        if(index == result.length){
            return result;
        }
        int sum = 0;
        a[queries[index][1]]+=queries[index][0];
        for (int i : a) {
            if(i%2 ==0){
                sum += i;
            }
        }
        result[index]=sum;
        helper(a,queries,++index,result);
        return result;
    }

    public static void main(String[] args) {
        Problem_985 problem_985  = new Problem_985();
        for (int a:problem_985.sumEvenAfterQueries(new int[]{1,2,3,4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}})) {
            System.out.println(a);
        }
    }
}
