
package ajmodule2;
import java.util.*;

public class quiz {


   int quiz(Properties capitals){
        Scanner in = new Scanner(System.in);
        Set<?> states = capitals.keySet();
        int nq = 5;
        int score = 0;
        String ans;
        for(Object state: states){
            System.out.println("What is the capital of "+state);
            ans = in.nextLine();
            if (capitals.getProperty((String)state).equals(ans)) score++;
            System.out.println(capitals.getProperty((String)state));
            nq--;
            if (nq<=0) break;
        }
        
        return score;
        
    }
	public quiz() {
		Properties capitals = new Properties();
		capitals.put("Karnataka","Bangalore"); capitals.put("Tamil Nadu", "Chennai");
		capitals.put("Telengana", "Hyderabad"); capitals.put("Kerala", "Thiruvannthapuram");
		capitals.put("West Bengal","Kolkata"); capitals.put("Bihar", "Patna");
		capitals.put("Haryana","Chandigarh");capitals.put("Goa","Panaji");
		capitals.put("Assam","Dispur"); capitals.put("Jharkhand", "Ranchi");
		
		int score = quiz(capitals);
		System.out.println("You scored: "+score);
    }
}


