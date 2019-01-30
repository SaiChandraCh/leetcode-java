package ArraysEasy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_697 {
    public int findShortestSubArray(int[] nums) {
        List maxFreqNums = maxFreqNums(nums,0,nums.length-1);
        System.out.println(maxFreqNums);
        return 0;
    }

    private List maxFreqNums(int[] nums,int start, int end) {
        Map<Integer,Integer> countMap = new HashMap();
        List list = new ArrayList();
        int count = 0,max = 0;
        for (int num:nums) {
            if(countMap.get(num) == null){
                countMap.put(num,1);
            }else{
                count = countMap.get(num);
                countMap.put(num,++count);
            }
        }
        for (int key : countMap.keySet()) {
            if(max<countMap.get(key)){
                max = countMap.get(key);
            }
        }
        System.out.println(max);
        for (int key : countMap.keySet()) {
            if(max == countMap.get(key)){
                list.add(key);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Problem_697 problem_697 = new Problem_697();
        problem_697.findShortestSubArray(new int[]{1, 2, 2, 3, 1});
    }
}
