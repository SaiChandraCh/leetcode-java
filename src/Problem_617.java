import java.util.LinkedList;
import java.util.Queue;

public class Problem_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(t2);
        TreeNode res = t1, temp = null;
        while (!queue1.isEmpty()) {
            temp = queue1.remove();
            temp.val += res.val;
            if(temp.left != null){
                queue1.add(temp.left);
            }
            if(temp.right != null){
                queue1.add(temp.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Problem_617 problem_617 = new Problem_617();
    }
}
