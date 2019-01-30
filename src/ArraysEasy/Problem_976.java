package ArraysEasy;

import java.util.Arrays;

public class Problem_976 {
    public int largestPerimeter(int[] A) {
        int a=0,b=0,c=0,perimeter=0,len = A.length;
        Arrays.sort(A);
        for (int i = 1; i < len-1 ; i++) {
            a = A[len-i];
            b = A[len-(i+1)];
            c=A[len-(i+2)];
            if(a+b > c && a+c > b && b+c > a && perimeter < a + b + c){
                perimeter = a + b + c;
            }

        }
//        for (int i = 0; i < len; i++) {
//            a=A[i];
//            for(int j = i+1; j< len; j++){
//                b=A[j];
//                for(int k = j+1;k<len;k++){
//                    c=A[k];
//                    System.out.println(a+", "+b+", "+c);
//                    if(a+b > c && a+c > b && b+c > a && perimeter < a + b + c){
//                        perimeter = a + b + c;
//                    }
//                }
//            }
//        }
        return perimeter;
    }

    public static void main(String[] args) {
        Problem_976 problem_976 = new Problem_976();
        System.out.println(problem_976.largestPerimeter(new int[]{3,2,3,4}));
    }
}
