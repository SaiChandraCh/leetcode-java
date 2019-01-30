package ArraysEasy;

public class Problem_665 {
    public static void main(String[] args) {
        Problem_665 problem_665 = new Problem_665();
        System.out.println(problem_665.checkPossibility(new int[]{-1,4,2,3}));//{-1,4,2,3}, {3,4,2,3}, {1}, {1,2,3}, {1,3,2}, {2,3,3,2,4}
    }
    public boolean checkPossibility(int[] nums) {
        int length = nums.length,count=0,prev=0;
        if(length>1){
            for (int i = 0; i < length-1; i++) {
                if(nums[i]>nums[i+1] && prev>=nums[i+1]){
                    count++;
                    nums[i+1]=nums[i];
                }else if(nums[i]>nums[i+1] && prev<=nums[i+1] ){
                    count++;
                    nums[i]=nums[i+1];
                }
                prev = nums[i];
            }
            return count<=1;
        }else {
            return true;
        }
    }
}
