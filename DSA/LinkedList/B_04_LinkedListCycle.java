package DSA.LinkedList;

public class B_04_LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    static boolean hasCycle(ListNode head) {
        //Both the pointers will be initially pointing towards head
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            //If the fastPointer reaches null or if its next is pointing to null, we can break the loop
            fastPointer = fastPointer.next.next;//Moving fastPointer by 2 steps
            slowPointer = slowPointer.next;//Moving slowPointer by 1 step
            if(fastPointer == slowPointer){
                //If at any node, the fastPointer is equal to the slowPointer, it means that the given linked list contains cycle. Hence, returning true
                return true;
            }
        }
        return false;//Else we can return false
    }
     static int noOfNodesInCycle(ListNode head) {
        int count = 0;
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                //This means that we have found the cycle.
                //Now just traverse the slow pointer till it reaches back to the fastPointer position
                slowPointer = slowPointer.next;
                count++;
                while (slowPointer==fastPointer){
                    slowPointer = slowPointer.next;
                    count++;
                }
            }
        }
        return count;
    }
}
