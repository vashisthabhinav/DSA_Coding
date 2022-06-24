package DSA.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class B_02_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(34);
        queue.add(23);
        queue.add(45);
        queue.add(89);
        queue.add(21);
        queue.add(12);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //Dequeue
        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(34);
        dequeue.addLast(23);
        dequeue.remove();
        dequeue.removeLast();
        dequeue.add(21);
        dequeue.add(12);
    }
}
