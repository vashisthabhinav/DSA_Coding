package DSA.LinkedList;

public class B_01_DoublyLL {
    Node head;
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        Node last = head;
        if (head==null){
            //Empty list
            node.prev = null;
            head = node;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public void insertAfter(int after, int val){
        Node p = find(after);
        if (p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next!=null){
            node.next.prev = node;
        }
    }
    public Node find(int val){
        //It will give the node
        Node node = head;
        while (node!=null){
            if (node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Reverse");
        while (last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
