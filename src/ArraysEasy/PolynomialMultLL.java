package ArraysEasy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Node{
    int constant=0,exp=0;
    Node(int constant,int exp){
        this.constant = constant;
        this.exp = exp;
    }

    public int getConstant() {
        return constant;
    }

    public int getExp() {
        return exp;
    }

}
public class PolynomialMultLL {
    static List<Node> pq =null;
    public static void main(String[] args) {
        System.out.print("Enter no.of test cases : ");
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();
        for (int i = 1; i <= testCaseCount; i++) {
            List<Node> p = new LinkedList();
            List<Node> q = new LinkedList();
            pq = new LinkedList();
            String result = "";
            int constant =0,exp = 0;
            System.out.print("Enter highest order : ");
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println("Enter constants for equation : 1");
            for (int j = 0; j < m; j++) {
                p.add(new Node(scanner.nextInt(),j));
            }
            System.out.println("Enter constants for equation : 2");
            for (int j = 0; j < n; j++) {
                q.add(new Node(scanner.nextInt(),j));
            }

            for (Node node1 : p) {
                for (Node node2: q) {
//                    if(node1.getConstant()*node2.getConstant()>0){
                        pq.add(new Node(node1.getConstant()*node2.getConstant(),node1.getExp()+node2.getExp()));
//                    }
                }
            }
            for (int k =0 ;k<pq.size();k++) {
                for (int l=k+1;l<pq.size();l++) {
                    if (pq.get(k).getExp() == pq.get(l).getExp()){
                        pq.set(k,new Node(pq.get(k).getConstant()+pq.get(l).getConstant(),pq.get(l).getExp()));
                        pq.remove(l);
                    }
                }
            }
        }
        for (int i = 0; i < testCaseCount; i++) {
            for (Node node : pq) {
                System.out.print(node.getConstant()+" ");
            }
        }

    }
}
//2x^0+4x^2+6x^2+12x^4+4x^3+8x^5