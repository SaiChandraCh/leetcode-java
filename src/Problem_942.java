public class Problem_942 {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int[] res = new int[len+1];
        String[] strings = S.split("");
        int count = 0;

        if(strings[0].equals("I")){
            for (int i=0; i<=len; i++){
                res[i]=i;
            }
            for (int i = 0; i < strings.length; i++) {
                if(strings[i].equals("D")){
                    count++;
                }else{
                    i = i - count;
                }
            }
        }else {
            int temp = len;
            for (int i = 0; i <= len; i++){
                res[i]=temp--;
            }
            for (int i = 0,j=0; i < strings.length  && j < res.length-1; i++,j++) {
                if(strings[i].equals("I")){
                    temp = res[j+1];
                    res[j+1] = res[j];
                    res[j] = temp;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        Problem_942 problem_942 = new Problem_942();
        for (int num : problem_942.diStringMatch("IDD")) {
            System.out.println(num);
        }
    }
}
