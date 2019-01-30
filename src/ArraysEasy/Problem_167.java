package ArraysEasy;

public class Problem_167 {
    public int[] twoSum(int[] numbers, int target) {
        return helper(numbers,target,0,0,1);
    }

    private int[] helper(int[] numbers, int target,int iterartionCount, int index1, int index2) {
        if(numbers[index1]+numbers[index2] == target && index1 != index2){
            return new int[]{index1+1,index2+1};
        }else{
            int len = numbers.length;
            if(iterartionCount == len || numbers[index1] == 0 || numbers[index1] > target){
                return helper(numbers,target,0,++index1,0);
            }else{
                return helper(numbers,target,++iterartionCount,index1,index2<len-1?++index2:0);
            }
        }
    }

    public static void main(String[] args) {
        Problem_167 problem_167 = new Problem_167();
        for (int a : problem_167.twoSum(new int[]{1, 2, 3, 4, 4, 9, 56, 90},8)){
            System.out.println(a);
        }
    }
}
