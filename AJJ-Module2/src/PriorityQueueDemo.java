import java.util.*;
import java.util.Comparator;


public class PriorityQueueDemo {
    public PriorityQueueDemo(){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);pq.add(54);  pq.add(5);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        PriorityQueue<Integer> pq_c = new PriorityQueue<Integer>(Comparator.reverseOrder());
        pq_c.add(1);pq_c.add(54);  pq_c.add(5);
        System.out.println(pq_c);
         System.out.println(pq_c.poll());
        System.out.println(pq_c.poll());
        System.out.println(pq_c.poll());
        
    }
}
