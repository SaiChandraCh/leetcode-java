package ArraysEasy;

public class Problem_189 {

    public void rotate(int[] nums, int k) {
        int length = nums.length-1, temp, tempIndex = k,index;
        for (int i = length; i > 0 && k > 0; i--) {
            temp = nums[i];
            nums[i] = nums[k-1];
            nums[k-1] = temp;
            k--;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Problem_189 problem_189 = new Problem_189();
        problem_189.rotate(new int[]{1,2,3,4,5,6,7,8,9,10,11},3);
    }
}
