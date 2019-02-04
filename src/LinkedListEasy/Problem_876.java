package LinkedListEasy;

class Solution {
    public ListNode middleNode(ListNode head) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        int length = 0;
        ListNode temp = head;
        while(temp !=null){
            length++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < length/2; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
