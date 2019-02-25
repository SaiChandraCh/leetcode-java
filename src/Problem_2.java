class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int x) { val = x; }
}

public class Problem_2 {
    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        int carry = 0, sum;
        ListNode1 temp = l1,prev = temp;
        sum = temp.val + l2.val;
        temp.val = (sum)%10;
        carry = (sum)/10;
        temp = temp.next;
        l2 = l2.next;
        while (l2 != null && temp != null){
            sum = (temp.val + l2.val+ carry);
            temp.val = sum%10 ;
            carry = (sum)/10;
            l2 = l2.next;
            prev = temp;
            temp = temp.next;
        }
        while (carry>0){
            if(temp == null && l2 != null){
                sum = l2.val+carry;
                prev.next = new ListNode1(sum%10);
                l2 = l2.next;
                prev = prev.next;
            }else if(l2 == null && temp != null){
                sum = temp.val+carry;
                temp.val = sum%10;
                prev = temp;
                temp = temp.next;
            }else if(temp == null && l2 == null){
                sum = carry;
                prev.next = new ListNode1(sum%10);
                prev = prev.next;
            }
            carry = sum/10;
        }
        
        if(l2 != null){
            prev.next = l2;
        }
        return l1;
    }

    public static void main(String[] args) {
        Problem_2 problem_2 = new Problem_2();
        ListNode1 l1 = new ListNode1(1);
        l1.next = new ListNode1(7);
        ListNode1 l2 = new ListNode1(9);
        l2.next = new ListNode1(9);
        l1 = problem_2.addTwoNumbers(l1,l2);
        while (l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}
