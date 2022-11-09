package q26;

public class Singleton {
	
	private static Singleton st = null;   
	
	public String str;   
	   
	private Singleton() {   
	      str = "Hello!";   
	}   
	 
	public static Singleton getID() {   
	//lazy initialization  
		if (st == null)   
	        st = new Singleton(); 
		
	    return st;   
	}   
	
}  
	
