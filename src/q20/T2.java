package q20;

public class T2 extends Thread {
	
	 public void run() {  
	        System.out.println("***************T2*************");  
	          
	        for (int i = 1; i <= 5; i++)  
	        {  
	            System.out.println("i = " + i);  
	        } 
	        System.out.println("***************END*************");  
	 }

}
