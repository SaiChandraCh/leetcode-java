package ArraysEasy;

public class Problem_905 {

    public static void main(String[] args) {
        int[] A = new int[4];
        A[0]=3;A[1]=1;A[2]=2;A[3]=4;
        sortArrayByParity(A);
    }
    public static int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int len1 = 0, len2 = length-1;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            if(A[i]%2 ==0){
//                EVEN
                result[len1] = A[i];
                System.out.println("even : "+result[len1]+"\t i : "+i+"\t len1 : "+len1);
                len1++;
            }else{
//                ODD
                    result[len2] = A[i];
                    System.out.println("odd if : "+result[len2]+"\t i : "+i+"\t len2 : "+len2);
                    len2--;
            }
        }
        for (int a:result) {
            System.out.println(a);
        }
        return result;
    }
}
