package test.datastructures;

import java.util.*;

class PriorityQueueCustom {
    PriorityQueue priorityQ = new PriorityQueue<Integer>();
    public PriorityQueueCustom(Integer... arr){
        this.priorityQ.addAll(Arrays.asList(arr));
    }
    void displayQueue(){
        Iterator itr = priorityQ.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

public class PriorityQueueCheck{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int length = scan.nextInt();
        Integer arrInput[] = new Integer[length];
        for(int i=0;i<length;i++){
            arrInput[i] = rand.nextInt(1000);
            System.out.println(arrInput[i]);
        }
        PriorityQueueCustom a = new PriorityQueueCustom(arrInput);
        System.out.println("----------------");
        a.displayQueue();
    }
}