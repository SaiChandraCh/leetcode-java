package ArraysEasy;

import java.util.ArrayList;
import java.util.List;

public class Problem_169 {
    public static void main(String[] args) {
        majorityElement(new int[]{2,2,1,1,1,2,2});
    }
    public static int majorityElement(int[] nums) {
        int maxNum = nums[0],count=0,tempCount=0,temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                temp=nums[i];
                if(temp==nums[j]){
                    tempCount++;
                    if(tempCount>count){
                        count=tempCount;
                        maxNum=temp;
                    }
                }
            }
            tempCount=0;
        }
        return maxNum;
    }
}
