import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class BinaryTree {
    TreeNode root;
    public void insert(TreeNode newNode) {
        if(root == null){
            root = newNode;
            return;
        }else {
            TreeNode temp = null;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                temp = queue.remove();
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            if(temp.left == null){
                temp.left = newNode;
            }else if(temp.right == null){
                temp.right = newNode;
            }
        }
    }

    public void print() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();
            System.out.println(temp.val);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }

    }
}

public class Problem_993 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(new TreeNode(1));
        tree.insert(new TreeNode(2));
        tree.insert(null);
        tree.insert(new TreeNode(3));
        tree.insert(new TreeNode(4));
        tree.insert(null);
        tree.insert(null);
        tree.insert(new TreeNode(5));

        Problem_993 problem_993 = new Problem_993();
        System.out.println(problem_993.isCousins(tree.root,2,4));
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int xDepth = 0, yDepth = 0, xParent = 0, yParent = 0 ,level = 1;
        boolean xFound = false, yFound = false, done = false;
        TreeNode last = root.right != null ? root.right : root.left;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!done){
            if (!queue.isEmpty()){
                TreeNode temp = queue.remove();
                if(temp.left != null){
                    if((temp.left.val == x && temp.right != null && temp.right.val == y) || (temp.left.val == y && temp.right != null && temp.right.val == x)){
                        return false;
                    }else if(temp.left.val == x){
                        xDepth = level;
                        xParent = temp.val;
                        xFound = true;
                        if(yFound){
                            break;
                        }
                    }else if(temp.left.val == y){
                        yDepth = level;
                        yParent = temp.val;
                        yFound = true;
                        if(xFound){
                            break;
                        }
                    }
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    if((temp.right.val == x && temp.left != null && temp.left.val == y) || (temp.right.val == y && temp.left != null && temp.left.val == x)){
                        return false;
                    }else if(temp.right.val == y){
                        yDepth = level;
                        yParent = temp.val;
                        yFound = true;
                        if(xFound){
                            break;
                        }
                    }else if(temp.right.val == x){
                        xDepth = level;
                        xParent = temp.val;
                        xFound = true;
                        if(yFound){
                            break;
                        }
                    }
                    queue.add(temp.right);
                }
                if(last == temp.right){
                    level++;
                    last = last.right != null ? last.right : last.left;
                }
            }
        }
        System.out.println(xDepth +"\t"+ yDepth +"\t"+ xParent+"\t"+yParent);
        return xDepth == yDepth && xParent != yParent;
    }
}