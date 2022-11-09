package q13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<String>();
		 
        // adding object to arraylist
        cities.add("KC");
        cities.add("NY");
        cities.add("NJ");
 
        // traversing elements using Iterator'
        System.out.println("ArrayList elements are:");
        Iterator itr = cities.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
 
        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("Kansas City");
        v.addElement("New York");
        v.addElement("New Jersey");
 
        // traversing elements using Enumeration
        System.out.println("Vector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        
	}

}
