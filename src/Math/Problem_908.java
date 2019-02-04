package Math;

public class Problem_908 {
    public int smallestRangeI(int[] A, int K) {
        int min=A[0],max=0,result;
        for (int a : A) {
            if(min>a){
                min=a;
            }
        }
        for (int a : A) {
            if(a>max){
                max=a;
            }
        }
        result = (max-K) - (min + K);
        return result<0?0:result;
    }

    public static void main(String[] args) {
        Problem_908 problem_908 = new Problem_908();
        System.out.println(problem_908.smallestRangeI(new int[]{0,10},2));
    }
}
