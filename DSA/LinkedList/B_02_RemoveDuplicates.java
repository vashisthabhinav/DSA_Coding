package DSA.LinkedList;

public class B_02_RemoveDuplicates {
    public static void main(String[] args) {
        B_01_LinkedList list = new B_01_LinkedList();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(4);
        list.display();
        list.duplicates();
        list.display();
    }
}
