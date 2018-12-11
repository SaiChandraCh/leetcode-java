import java.util.Arrays;

public class ArrayPairMinSum {
    public static void main(String[] args) {
        arrayPairSum(new int[]{1,1,1,1});
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        for (int i = 0; i < nums.length; i= i+2) {
            min = min + (nums[i]<nums[i+1]?nums[i]:nums[i+1]);
            System.out.println("min : "+min);
        }
        System.out.println(min);
        return min;
    }
}
