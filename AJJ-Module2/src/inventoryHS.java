
package ajmodule2;
import java.util.*;
public class inventoryHS {
    Hashtable<String, Integer> inv = new Hashtable<String,Integer>();
    public void add(String item, int qty){
        int existing_qty=inv.getOrDefault(item,0 );
        inv.put(item, qty+existing_qty);
        
    }
    public void get(String item, int qty){
        if(inv.get(item)!=null){
            int existing_qty=inv.get(item);
            if (qty> existing_qty)
                System.out.println(item+" Required Stock not available");
            else
                inv.put(item, existing_qty-qty);
        }else
            System.out.println(item+" Item not found");
    }
    public void display(){
        System.out.println("ITEM"+ " \t "+"QUANTITY" );
        Enumeration<String> items = inv.keys();
        while(items.hasMoreElements()){
            String item  = items.nextElement();
            int qty = inv.get(item);
            System.out.println(item+ " \t "+qty );
        }
            
        
    }
    public inventoryHS(){
        add("Pencil",10); add("Sharpener",50);add("Eraser", 50);
        add("Stapler", 45);add("ruler",10);add("Pencil",15); 
        add("Stapler",20);   
        display();
        get("ruler",10); get("Pencil", 5); get("ruler", 5);
        get("notebook",4);
        display();
        
    }
    
}
