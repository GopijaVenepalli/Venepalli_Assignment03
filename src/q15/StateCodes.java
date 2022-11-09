package q15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class StateCodes {
	public static void main(String args[]) {
	
	Map<String, String> m1 = new HashMap<String, String>();

    m1.put("1","TX");
    m1.put("2","MO");
    m1.put("3","IL");
   
    System.out.println("HashMap: " + m1);

    Map<String, String> m2 = new Hashtable<String, String>();
 
    m2.put("1", "TX");
    m2.put("2", "MO");
    m2.put("3", "IL");

    System.out.println("HashTable: " + m2);
    
    }
}

