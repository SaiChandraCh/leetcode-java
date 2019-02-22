public class Problem_984 {

    public static void main(String[] args) {
        Problem_984 problem_984 = new Problem_984();
        problem_984.strWithout3a3b(2,3);
    }

    public String strWithout3a3b(int A, int B) {
        int size = A+B;
        char[] s = new char[size];
        int i = 0;
        while(A>0 || B>0){
            if(i>=2 && s[i-1] == 'a' && s[i-2] == 'a'){
                s[i]='b';
                B--;
            }else if(i>=2 && s[i-1] == 'b' && s[i-2] == 'b'){
                s[i]='a';
                A--;
            }else {
                if(B>A){
                    s[i]='b';
                    B--;
                }else{
                    s[i]='a';
                    A--;
                }
            }
            i++;
        }
        String string = "";
        for (char a : s) {
            string=string+a;
        }
        System.out.println(string);
        return string;
    }
}
