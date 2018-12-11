public class FindEleSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,3,3,4,4,5,5,10};
        int min=0,max=nums.length,mean,result=0;
        boolean found = false;
        while (!found){
            mean = (min+max)/2;
            if(max-min == 2){
                if(nums[mean] == nums[mean-1]){
                    found = true;
                    result = nums[max];
                }else if(nums[mean] == nums[mean+1]){
                    found = true;
                    result = nums[min];
                }
            }else if(nums[mean] == nums[mean-1]){
                max = mean;
            }else if(nums[mean] == nums[mean+1]){
                min = mean;
            }
            else{
                found = true;
                result = nums[mean];
            }
        }
        System.out.println("result : "+ result);
    }
}
