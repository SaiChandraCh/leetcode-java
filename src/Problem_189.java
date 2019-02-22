public class Problem_189 {

    public void rotate(int[] nums, int k) {
        int length = nums.length-1;
        int temp;
        while(k>nums.length){
            k=k-nums.length;
        }
        for (int i = 0; i <= length/2; i++) {
            temp = nums[i];
            nums[i] = nums[length-i];
            nums[length-i] = temp;
        }
        int j = k-1;
        for (int i = 0; i < k/2 && j<length+1; i++) {
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
        }
        j=length;
        int count = (length+1-k)/2;
        for (int i = k; count>0 ; i++ , count--) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Problem_189 problem_189 = new Problem_189();
        problem_189.rotate(new int[]{-1},2);
    }
}
