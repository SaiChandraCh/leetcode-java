import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Problem_448 {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]/*{1,1});*/{4,3,2,7,8,2,3,1});
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        if(nums.length>0){
            int min=1, max=nums.length;
            for (int i = min; i <= max; i++) {
                list.add(i-1,i);
            }
            System.out.println(list);

            System.out.println(list);
        }
        return list;
    }
}
