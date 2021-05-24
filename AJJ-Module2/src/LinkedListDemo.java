import java.util.*;
import java.util.function.UnaryOperator;
public class LinkedListDemo {
    //Extends AbstractSequentialList
//Implements List, Queue and Deque interfaces

class uop implements UnaryOperator<String>{
    public String apply(String str){
        return "TYL "+str+" P3";
    }
}
public LinkedListDemo(){
    LinkedList<String> li = new LinkedList<String>(); // creates ane empty list
    // create a linked list of programming languages.
    //demo of queue methods
    li.add("Java"); li.add("PHP"); li.add("C++");
    //adds to the tail of the queue
    System.out.println("Contents :"+li);
    //deque methods
    //simulate FIFO - queue
    li.addLast("JS"); li.addLast("C#");
    System.out.println("Deque addLast(tail of the queue)-Contents :"+li);
    
    //used to simulate LIFO - Stack
    li.addFirst("OpenGL"); li.addFirst("Ruby");
    System.out.println("Deque addFirst(head of the queue)-Contents :"+li);

    // equivalent to li.removeFirst
    System.out.println("Remove from head of queue "+li.remove()); //removes element at head, index 0
    System.out.println("Remaining contents "+li);// the element is returned and removed from the head of q.
   
    System.out.println("Examine from head of queue "+li.element()); //return element at head, index 0
    System.out.println("Remaining contents "+li);// the element is returned but not removed from the head of q.
    
    //Deque methods
    System.out.println("Remove from tail of queue"+li.removeLast());
    System.out.println("Remaining contents "+li);
    
   // Examine head and tail of queue
    System.out.println("Element at head of queue: "+ li.peekFirst());
    System.out.println("Element at tail of queue: "+li.peekLast());
    System.out.println("Contents :"+li);
    
    // replace All instances with TYL in front and P3 at the end
    li.replaceAll(new uop());
    System.out.println("Contents after replacing:"+ li);
    
    // get, set methods
    
    li.clear();
    System.out.println("After clearing "+li);
    System.out.println("Remove from tail of queue: "+li.pollLast());
    //System.out.println("Remove from tail of queue: "+li.removeLast());
    
    
    
    
}

}
