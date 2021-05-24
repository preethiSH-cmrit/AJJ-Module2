import java.util.*;

public class arrayListDemo {
    
    public arrayListDemo(){
        
        ArrayList<Integer> ari = new ArrayList<Integer>(20);
        System.out.println(ari+" "+ari.size());
        for(int i=1; i<=10; i++)
            ari.add(i);
        System.out.println("ari : "+ari);
        
        int s=0;
        Integer ar_i[] = new Integer[10];
        ar_i  =  ari.toArray(ar_i);
        for (Integer i: ar_i){ // parsing the array ar_i
            s+=i;
        }
        System.out.println("Sum of items in ai :"+s);
        
        
        
        System.out.println("\n\n\n\n");
        
        ArrayList<String> subjects =new ArrayList<String>();
        
        //Add items
        subjects.add("Java"); subjects.add("USP"); subjects.add("CGV");
        // print the size of array
        System.out.println("Size of subjects: "+subjects.size());
        System.out.println("Contents of subjects: " +subjects);
        subjects.remove("Java");
        subjects.remove(0);
        System.out.println(subjects);
       
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(2);ai.add(3);ai.add(5);ai.add(7);
        int sum=0;
        
        ListIterator li = ai.listIterator();
        /* listerator */
        System.out.println("ListIterator");
        while(li.hasNext()){
            
            System.out.println(li.next()+" ");
            
        }
        System.out.println("traversing in reverse");
        while(li.hasPrevious()){
            System.out.println(li.previous()+" ");
        }
        li.remove();
        System.out.println(ai);
        for(Integer item:ai){
            sum+=item;
        }
        System.out.println("Sum of items : "+sum);
            
        
        Integer []arr = new Integer[ai.size()];
        arr = ai.toArray(arr);
        
        
    }
    
}
