package ArraysEasy;

import java.util.ArrayList;
import java.util.List;

public class Problem_448 {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{5,4,6,7,9,3,10,9,5,6});
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        if(nums.length>0){
            int min=1, max=nums.length;
            for (int i = min; i <= max; i++) {
                list.add(i-1,i);
            }
            for (int num : nums) {
                try {
                    list.remove(num-1);
                    list.add(num-1,-1);
                }catch (Exception e){
                    continue;
                }
            }
            for (int i=0;i<max;i++) {
                int num = list.get(i);
                if( num == -1){
                    list.remove(i);
                    max--;
                    i--;
                }
            }
        }
        return list;
    }
}
