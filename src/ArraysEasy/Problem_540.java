package ArraysEasy;

public class Problem_540 {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,2,3,3,4,4,5,5,10}));
    }

    private static int singleNonDuplicate(int[] nums) {
        if(nums.length>1){
            int max=nums.length,result=0;
            for (int i = 0; i < max-1; i=i+2) {
                if(nums[i]!=nums[i+1]){
                    result =nums[i];
                    break;
                }
            }
            if(max%2!=0 && result==0){
                result = nums[max-1];
            }
            return result;
        }else
            return 0;

    }
}
