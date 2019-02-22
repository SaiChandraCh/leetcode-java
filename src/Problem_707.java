public class Problem_707 {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        linkedList.get(1);            // returns 2
        linkedList.deleteAtIndex(1);  // now the linked list is 1->3
        linkedList.get(1);            // returns 3
    }
}
class MyLinkedList {
    MylinkedListNode head;
    int length;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        length = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        MylinkedListNode temp = head;
        try{
            while(index != 0 ){
                --index;
                temp = temp.next;
            }
            return temp.val;
        }catch (NullPointerException e){
            return -1;
        }
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        MylinkedListNode newNode = new MylinkedListNode(val);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        MylinkedListNode newNode = new MylinkedListNode(val);
        if(head == null){
            head = newNode;
        }else{
            MylinkedListNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        MylinkedListNode newNode = new MylinkedListNode(val);
        if(index>length){
            return;
        }
        if(head == null){
            head = newNode;
        }else{
            MylinkedListNode temp = head;
            MylinkedListNode prev = temp;
            while (index != 1){
                --index;
                prev = temp;
                temp = temp.next;
            }
            prev.next = newNode;
            newNode.next = temp;
        }
        length++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >= length){
            return;
        }
        if(head == null){
            return;
        }else{
            MylinkedListNode temp = head;
            MylinkedListNode prev = temp;
            while (index != 0){
                --index;
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
        --length;
    }
}

class MylinkedListNode {
    int val;
    MylinkedListNode next;
    MylinkedListNode(int val) {
        this.val = val;
    }
}