package algorithm_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class QueueInt_reverse {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.add(100);
        priorityQueue.add(79);
        priorityQueue.add(30);
        priorityQueue.offer(45);

        while (!priorityQueue.isEmpty()) {

            int a = priorityQueue.poll();

            System.out.println(a);
        }
    }
}
