import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_169 {
    public static void main(String[] args) {
        majorityElement(new int[]{2,2,1,1,1,2,2,});
    }
    public static int majorityElement(int[] nums) {
        int maxNum = nums[0],count=0,tempCount=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    tempCount++;
                    if(tempCount>count){
                        count=tempCount;
                        maxNum=nums[i];
                    }
                }
            }
            tempCount=0;
        }
        return maxNum;
    }
}
