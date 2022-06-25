package DSA.LinkedList;

public class B_01_LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public B_01_LinkedList() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;
        //It is a reference variable of type node because it is pointing to something that is of type node

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int val) {
        //Create a new node
        Node node = new Node(val);
        //Now pointing this new node to the element currently present as head
        node.next = head;
        //Now head will be pointing to the new node
        head = node;

        //If there is no element in the list and this is the first item to be added,
        // in this case tail is null currently
        if (tail == null) {
            tail = head;
        }

        //Now incrementing the size of the LinkedList
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            //It means that the linked list is empty currently
            //So, we can use insertFirst method
            insertFirst(val);
        } else {//List is not empty, so we have to addi it in the last
            //Create a new node
            Node node = new Node(val);
            //Now element at tail will be pointing to this node
            tail.next = node;
            //Now tail will become the new node
            tail = node;
            //Now incrementing the size of the LinkedList
            size++;
        }
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        }
        if (index == size) {
            insertLast(val);
        }
        if (index > size) {
            System.out.println("Index is not present");
        }
        //Create a temp node
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        //Then creating a new node to be added into the linked list
        //We give it the value and the next that it will point to
        Node node = new Node(val, temp.next);
        //Now changing the next of the node before the added node
        temp.next = node;
        //Now incrementing the size of the LinkedList
        size++;
    }

    public int deleteFirst() {
        //The value to be returned
        int val = head.value;
        //Head just shifts by one
        head = head.next;
        //If head is null, it means that now the list is empty
        //So, tail also equal to null
        if (head == null) tail = null;
        size--;
        return val;
    }

    public Node get(int index) {
        //It will give the node
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public boolean isPresent(int value) {
        //It will give the node
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
        }
        return false;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;//The value to be removed is currently present at tail
        tail = secondLast;//Now the new tail will be present at secondLast element
        tail.next = null;//And it will be pointing to the second last element
        return val;//Returning the value
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);//Get to the node previous to the node to be deleted
        int val = prev.next.value;//Now the value to be deleted will be present at the next of the prev node
        prev.next = prev.next.next;//NOw previous node will be directly pointing to the node next of the node that is being eleted
        return val;
    }

    //Insert using recursion

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void display() {
//        To display the linked list, we just iterate over a temp that goes from head value till it reaches the end (null)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    //    Questions
    //Q83 Remove Duplicates in linked list
    public void duplicates() {
        Node node = head;

        //Making a loop that will run till tail
        while (node.next != null) {
            if (node.value == node.next.value) {
                //It means that the current value and the next value are equal, and they are the duplicates
                //So directly pointing node.next to the next to next element
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static B_01_LinkedList merge(B_01_LinkedList first , B_01_LinkedList second){
        Node f = first.head;
        Node s = second.head;
        B_01_LinkedList ans = new B_01_LinkedList();
        while (f!=null && s!=null){
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }
}