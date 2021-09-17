package algorithm_queue;

import java.util.PriorityQueue;

public class PriorityqueueString implements Comparable<PriorityqueueString>{
    private int writeRowNumber;
    private String content;

    public PriorityqueueString(int writeRowNumber, String content){
        this.writeRowNumber = writeRowNumber;
        this.content = content;
    }

    public int getWriteRowNumber(){
        return this.writeRowNumber;
    }

    public String getContent(){
        return this.content;
    }

    @Override
    public int compareTo(PriorityqueueString pqs) {
        if(this.writeRowNumber > pqs.getWriteRowNumber()){
            return 1;
        }else if (this.writeRowNumber < pqs.getWriteRowNumber()){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        PriorityQueue<PriorityqueueString> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new PriorityqueueString(2,"스터디 시작 2주"));
        priorityQueue.add(new PriorityqueueString(33,"스터디 시작 33주"));
        priorityQueue.add(new PriorityqueueString(7,"스터디 시작 7주"));
        priorityQueue.add(new PriorityqueueString(16,"스터디 시작 16주"));
        priorityQueue.add(new PriorityqueueString(16,"스터디 시작 16주"));

        while(!priorityQueue.isEmpty()){
            PriorityqueueString priorityqueueString = priorityQueue.poll();
            System.out.println("스터디 넘버 :" + priorityqueueString.getWriteRowNumber()+"\t스터디 내용:"+priorityqueueString.getContent());
        }
    }
}
