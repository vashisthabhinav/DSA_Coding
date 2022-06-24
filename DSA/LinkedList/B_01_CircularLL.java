package DSA.LinkedList;

public class B_01_CircularLL {
    private Node head;
    private Node tail;

    public B_01_CircularLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.val +" -> ");
                node = node.next;
            }while (node != head);
        }
        System.out.println("HEAD");
    }
    public void delete(int val){
        Node node = head;
        if (node==null){
            return;
        }
        if (node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node nxtNode = node.next;
            if (nxtNode.val==val){
                node.next = nxtNode.next;
                break;
            }
            node = node.next;
        }while (node.next!=head);
    }
}
