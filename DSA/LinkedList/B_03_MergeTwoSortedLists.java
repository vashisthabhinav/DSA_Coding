package DSA.LinkedList;

public class B_03_MergeTwoSortedLists {
    public static void main(String[] args) {
        B_01_LinkedList first = new B_01_LinkedList();
        B_01_LinkedList last = new B_01_LinkedList();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(5);
        last.insertLast(2);
        last.insertLast(4);
        last.insertLast(8);
        last.insertLast(9);
        B_01_LinkedList ans = B_01_LinkedList.merge(first, last);
        ans.display();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        while(list1 != null){
            tail.next = list1;
            list1 = list1.next;
            tail = tail.next;
        }
        while(list2 != null){
            tail.next = list2;
            list2 = list2.next;
            tail = tail.next;
        }
        return head.next;
    }

}
