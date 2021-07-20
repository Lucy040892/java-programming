package day63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        //FIFO - first in first out
        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add(("four"));

        System.out.println(queue.element()); //looking at the top element, if queue empty - gives exception
        System.out.println(queue.peek()); //looking at the top element, if queue empty - returns null
        System.out.println(queue);

        System.out.println(queue.remove());// remove the top element - if queue empty - gives exception
        System.out.println(queue.poll()); //remove the top element - if queue empty - return null
        //peek() - looking at the top element
        //PriorityQueue: implements Queue, but it doesn't FIFO. Null is not valid element

        System.out.println(queue);
    }
}
