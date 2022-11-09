package q27;

import q26.Singleton;

public class SDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s = Singleton.getID();  
		Singleton s1 = Singleton.getID(); 
		
		
		System.out.println("String from s is " + s.str);  
		System.out.println("String from s1 is " + s1.str); 

	}

}
