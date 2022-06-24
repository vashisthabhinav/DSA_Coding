package DSA.StacksAndQueues;

public class B_04_QueueMain {
    public static void main(String[] args) throws Exception {
//        B_04_CustomQueue queue = new B_04_CustomQueue();
//        queue.insert(34);
//        queue.insert(23);
//        queue.insert(45);
//        queue.insert(89);
//        queue.insert(21);
//        queue.insert(12);
//
//        queue.display();
//        queue.remove();
//        queue.display();
        B_04_CircularQueue queue = new B_04_CircularQueue(5);
        queue.insert(34);
        queue.insert(23);
        queue.insert(45);
        queue.insert(89);
        queue.insert(21);
        queue.insert(12);

        queue.display();
        queue.remove();
        queue.display();
    }
}
