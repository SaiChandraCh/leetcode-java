package ArraysEasy;

public class Problem_485 {
    public static void main(String[] args) {
        findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1});
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,max=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                count++;
                if(max<count){
                    max=count;
                }
            }else {
                if(max<count){
                    max=count;
                }
                count=0;
            }
        }
        System.out.println(max);
        return max;
    }
}
