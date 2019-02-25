public class Problem_540 {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,5,5,6,6}));//{1,1,2,2,3,3,4,4,5,5,6}
    }

    private static int singleNonDuplicate(int[] nums) {
        int length = nums.length-1,mid = length/2;
        while (true){
            mid = length/2;
            if(nums[mid] == nums[mid+1]){

            }else if(nums[mid] == nums[mid-1]){

            }else if(nums[mid] != nums[mid+1] && nums[mid] == nums[mid-1]){

            }

        }
    }
}
