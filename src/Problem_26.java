public class Problem_26 {
    public static void main(String[] args) {
        Problem_26 problem_26 = new Problem_26();
        problem_26.removeDuplicates(new int[]{1,1,2});//{0,0,1,1,1,2,2,3,3,4}//{0,0,0,0,0,1,2,2,3,3,4,4}//{1,1,2}
    }
    public int removeDuplicates(int[] nums) {
        int length = nums.length,index = 1,count = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                index++;
            }else {
                break;
            }
        }
//        System.out.println("index : "+index);
        if(index<length){
            for (int i = 0; i < nums.length-1; i++) {
                if(nums[i] == nums[i+1] ) {
                    length--;
                }
            }
            int i = index;
            for (; i < nums.length-1 && index < nums.length-1; i++) {
                    if(nums[i] != nums[i+1]) {
                        nums[index]=nums[i+1];
                        index++;
                        count = 1;
                    }else {
                        count++;
                }
            }
        }


        for (int num : nums) {
            System.out.println(num);
        }
//        System.out.println("====="+length+"======");
        return length;
    }
}
