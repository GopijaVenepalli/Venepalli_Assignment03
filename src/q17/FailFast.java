package q17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> emp = new HashMap<String, String>();   
        emp.put("Nick", "Amazon");   
        emp.put("Mac", "Microsoft");   
        emp.put("Haeley", "Apple");   
        Iterator iterator = emp.entrySet().iterator();   
        while (iterator.hasNext()) {   
            System.out.println(emp.get(iterator.next()));   
            // adding an element to Map   
            // exception will be thrown on next call of next() method.   
            emp.put("Istanbul", "Turkey");   
        }
	}

}
