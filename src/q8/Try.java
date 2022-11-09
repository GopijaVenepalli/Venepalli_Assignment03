package q8;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i=110;  
	     int j=10;  
	     int k;  
	        
	     try {  
	    	 k=i/j; //may throw exception   
	     }  
	            
	     // handling the exception  
	     finally {
	         System.out.println(i/(j+10));  
	     }  
	   
	}

}
