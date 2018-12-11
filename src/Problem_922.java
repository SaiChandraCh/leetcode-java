public class Problem_922 {

    public static void main(String[] args) {
        int[] A = new int[4];
        A[0]=3;A[1]=1;A[2]=2;A[3]=4;
        sortArrayByParity2(A);
    }
    public static int[] sortArrayByParity2(int[] A) {
        int length = A.length,evenIndex=0,oddIndex=1;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            if(A[i]%2 ==0){
                result[evenIndex]=A[i];
                evenIndex = evenIndex + 2;
            }else {
                result[oddIndex] = A[i];
                oddIndex = oddIndex + 2;
            }
        }
        return result;
    }
}
