public class Problem_942 {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int[] res = new int[len+1];
        int I = 0, D = len,index = 0;
        char[] s = S.toCharArray();
        for (char c : s) {
            if (c=='I'){
                res[index++] = I++;
            }else if(c=='D'){
                res[index++] = D--;
            }
        }

        for (int i = index; i < len+1; i++) {
            res[index] = D--;
        }
        return res;
    }

    public static void main(String[] args) {
        Problem_942 problem_942 = new Problem_942();
        for (int num : problem_942.diStringMatch("DDI")) {
            System.out.println(num);
        }
    }
}
