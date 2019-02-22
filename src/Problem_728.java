import java.util.ArrayList;
import java.util.List;

public class Problem_728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right ; i++) {
            if(i<10){
                list.add(i);
            }

        }
        return null;
    }
    public static void main(String[] args) {
        Problem_728 problem_728 = new Problem_728();
        problem_728.selfDividingNumbers(1,22);
    }
}
