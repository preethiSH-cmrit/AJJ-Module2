
package ajmodule2;
import java.util.*;
public class balanP {
    
    public balanP(){
        Stack<Character> bp = new Stack<Character>();
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a paranthesis sequence to be checked:");
         String inp = in.nextLine();
         for(int i=0; i<inp.length();i++){
             char sym = inp.charAt(i);
             if(sym=='(') bp.push(sym);
             if(sym==')') bp.pop();
            
        }
          if(bp.empty())
                 System.out.println("Balanced");
             else
                 System.out.println("Not Balanced");
            in.close();
         }
}
         
       
