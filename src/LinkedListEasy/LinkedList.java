package LinkedListEasy;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedList {

    ListNode head;
    int length = 0;
    public void insert(int val) {
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
        }else {
            ListNode temp = head;
            temp.next = newNode;

        }
    }
}
