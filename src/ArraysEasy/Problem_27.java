package ArraysEasy;

public class Problem_27 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length,index = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == val) {
                break;
            }else {
                index++;
            }
        }
        System.out.println("index : "+index);
        if(index<length){
            int i = index;
            for (; i < nums.length ; i++) {
                if(nums[i] != val){
                    nums[index] = nums[i];
                    index++;
                }else
                    length--;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
        return length;
    }

    public static void main(String[] args) {
        Problem_27 problem_27 = new Problem_27();
        problem_27.removeElement(new int[]{0,1,2,2,3,0,4,2},2);
    }
}