package q20;

public class T1 extends Thread {
	 public void run()   
	    {  
	        System.out.println("***************T1*************");  
	        
	        for (int i = 1; i <= 10; i++)   
	        {  
	            System.out.println("i = " + i);  
	            try   
	            {  
	                Thread.sleep(1000);  
	            }   
	            catch (InterruptedException e)   
	            {  
	                e.printStackTrace();  
	            }  
	        }  
	        System.out.println("***************END*************");  
	       
	    }  
	 

}
