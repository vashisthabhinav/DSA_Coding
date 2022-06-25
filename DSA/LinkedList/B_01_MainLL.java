package DSA.LinkedList;

public class B_01_MainLL {
    public static void main(String[] args) {
        B_01_LinkedList list = new B_01_LinkedList();
        list.insertFirst(12);
        list.insertFirst(21);
        list.insertFirst(39);
        list.insertLast(48);
        list.insert(57,3);
        list.insertRec(30,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.isPresent(30));


//        B_01_DoublyLL list = new B_01_DoublyLL();
//        list.insertFirst(12);
//        list.insertFirst(21);
//        list.insertFirst(30);
//        list.insertFirst(39);
//        list.insertLast(48);
//        list.insertAfter(30,57);
//        list.display();

//        B_01_CircularLL list = new B_01_CircularLL();
//        list.insert(12);
//        list.insert(21);
//        list.insert(30);
//        list.insert(39);
//        list.insert(48);
//        list.insert(57);
//        list.delete(21);
//        list.display();
    }
}