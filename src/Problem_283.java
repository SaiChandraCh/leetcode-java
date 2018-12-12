import java.util.Arrays;

public class Problem_283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public static void moveZeroes(int[] nums) {
        int j;
        for (int i = 0; i < nums.length-1; i++) {
            j=i+1;
            if (nums[i]==0){
                while (nums[j]==0 && j<nums.length-1){
                    j++;
                }
                nums[i]=nums[j];
                nums[j]=0;
            }
        }
        for (int a:nums) {
            System.out.println(a);
        }
    }
}

