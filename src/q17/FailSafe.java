package q17;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 5, 10, 15, 25, 30 });   
        Iterator itr = list.iterator();   
        while (itr.hasNext()) {   
            Integer i = (Integer)itr.next();   
            System.out.println(i);   
            if (i == 6)   
                list.add(35); // It will not be printed  
            //This means it has created a separate copy of the collection  
        }   
	}

}
