public class Problem_896 {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{6,5,5,4}));
    }
    public static boolean isMonotonic(int[] A) {
        int inc=1,dec=1;
        for (int i = 0; i < A.length-1; i++) {
            if (A[i]>=A[i+1]){
                inc++;
            }
        }

        for (int i = A.length-1; i > 0 ; i--) {
            if (A[i]>=A[i-1]) {
                dec++;
            }
        }
        if (inc==A.length || dec==A.length){
            return true;
        }else {
            return false;
        }
    }
}
