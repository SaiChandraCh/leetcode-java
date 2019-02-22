public class Problem_581 {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        return helper(nums, new int[length],length,0);
    }

    private int helper(int[] nums,int[] temp,  int length, int index) {
        boolean flag =true;
        for(int i=0;i<length-1;i++){
            if(nums[i]<nums[i+1]){
                flag = false;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Problem_581 problem_581 = new Problem_581();
        problem_581.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15});
    }
}
