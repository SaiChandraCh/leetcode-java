import java.util.ArrayList;
import java.util.List;

public class Problem_830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        char[] arr = S.toCharArray();
        int length = arr.length;
        return helper(new ArrayList<>(),new ArrayList(), arr,0,1,length-1,1);
    }

    private List helper(List mainList, List subList, char[] arr, int index1, int index2 , int length, int count) {
        if(length == 0 && index2 <= arr.length){
            return mainList;
        }
        if( arr[index1] == arr[index2] ){
            count++;
        }else if(count>=3 && arr[index1]!=arr[index2]){
            count = 1;
            subList.add(index1);
            subList.add(index2-1);
            mainList.add(subList);
            subList = new ArrayList();
            index1 = index2;
        }else if(count<3 && arr[index1]!=(arr[index2])){
            index1 = index2;
            count = 1;
        }
        if(count>=3 && arr[index1]==arr[index2] && index2 == arr.length-1){
            count = 1;
            subList.add(index1);
            subList.add(index2);
            mainList.add(subList);
            subList = new ArrayList();
            index1 = index2;
        }
        return helper(mainList,subList, arr, index1, ++index2 , --length,count);
    }

    public static void main(String[] args) {
        Problem_830 problem_830 = new Problem_830();
        System.out.println(problem_830.largeGroupPositions("abbxxxxzzy"));//"bababbaaab"
    }
}
