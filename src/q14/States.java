package q14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class States {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Non Synchronized ArrayList   
        List<String> s = new ArrayList<String>();  
  
        s.add("Texas");  
        s.add("Missouri");  
        s.add("Illinois");  
       
         
  
        // Synchronizing ArrayList in Java  
        s = Collections.synchronizedList(s);  
  
        // we must use synchronize block to avoid non-deterministic behavior  
        synchronized (s) {  
            Iterator<String> itr = s.iterator();  
            while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
        }  
        
        //OTHER METHOD
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        
        list.add("TX");
        list.add("MO");
        list.add("IL");
        
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
           String str = itr.next();
           System.out.println(str);
        }

	}

}
