import java.util.*;
import java.util.function.Predicate;
public class MethodsCollectionIfDemo {
    ArrayList<Integer> al = new ArrayList<Integer>();
    ArrayList<Integer> al2 = new ArrayList<Integer>();
    //add
    MethodsCollectionIfDemo(){
        //add
        for (int i=1; i<=10;i++)
            al.add(i);// getting autoboxed to object Integer.
       
        al.add(2, 500);
         System.out.println("contents of al : "+al);
        // al.remove(25); // removing object at index 25
         System.out.println("contents of al : "+al);
        System.out.println(al.remove(Integer.valueOf(15)));//object
         System.out.println(al.remove(Integer.valueOf(2)));  
        if(al2.addAll(al))
            System.out.println("elements in al added to al2");
        al.sort(Comparator.reverseOrder());
        System.out.println(al);
        /*
        ArrayList<Integer> al3 = (ArrayList<Integer> )al.subList(0, 2);
        al3.add(5);
        //remove
        al2.remove(2);
        
        //remove all
        al2.removeAll(al);
        System.out.println(al2);
        */
        //contains
        if(al.contains(2)) System.out.println("2 is in al");
         Predicate<Integer> pr= a->(a%2==0); 
         al.removeIf(pr);
         
         
         al2.remove(Integer.valueOf(5));
         
         System.out.println("al"+al);
         System.out.println("al2"+al2);
         System.out.println(al2.containsAll(al));
         
         Object[] obs = al2.toArray();
         
         Integer[] arr = new Integer[15];
         arr = al2.toArray(arr);
         System.out.println(Arrays.toString(arr));
         System.out.println("Size of al2:"+al.size());
    }
    
}
