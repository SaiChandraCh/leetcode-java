import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Problem_448 {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        if(nums.length>0){
            int min=1;
            int max=nums.length;
            Arrays.sort(nums);
            for (int num:nums) {
                if(!list.contains(num)){
                    list.add(num);
                }
            }
            int index = 0;
            for (int i = min; i <= max; i++) {
                if(list.contains(i)){
                    list.remove(index);
                }else {
                    list.add(i);
                }
            }
        }
        System.out.println(list);
        return list;
    }
}
