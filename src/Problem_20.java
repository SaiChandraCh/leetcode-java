import java.util.Stack;

public class Problem_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        char b;
        for (char a : chars) {
            if(a == '['||a == '('|| a == '{'){
                stack.push(a);
            }else {
                if(!stack.isEmpty()){
                    b = stack.pop();
                    if(a == '}' && b != '{'){
                        return false;
                    }else if(a == ')' && b != '('){
                        return false;
                    }else if(a == ']' && b != '['){
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Problem_20 problem_20 = new Problem_20();
        System.out.println(problem_20.isValid("{[]}"));
    }
}
