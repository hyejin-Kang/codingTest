package algorithm_queue;

import java.util.PriorityQueue;

public class QueueInt {

   public static void main(String[] args) {

      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

      //우선순위 큐 추가
      priorityQueue.add(1);
      priorityQueue.add(3);
      priorityQueue.add(5);
      priorityQueue.add(100);
      priorityQueue.add(79);
      priorityQueue.add(30);
      priorityQueue.offer(45);


      //우선순위 큐 삭제
      priorityQueue.remove(5);

      //우선순위 큐 초기화
      //priorityQueue.clear();


      if(!priorityQueue.isEmpty()){
         int b = priorityQueue.peek();
         System.out.println(b);
      }

      while(!priorityQueue.isEmpty()){

         int a = priorityQueue.poll();

         System.out.println(a);
      }


   }



}
