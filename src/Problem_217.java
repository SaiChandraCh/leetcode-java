//Check Duplicates
public class Problem_217 {
    public static void main(String[] args) {
        Problem_217 problem_217 = new Problem_217();
        System.out.println(problem_217.containsDuplicate(new int[]{1}));
    }

    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
