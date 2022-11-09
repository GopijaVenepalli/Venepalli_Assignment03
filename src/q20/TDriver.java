package q20;

public class TDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t1 = new T1();  
	    T2 t2 = new T2();  
	    t1.start();  
	    t2.yield(); 
	    try   
	    {  
	        t1.sleep(1000);  
	    }   
	    catch (InterruptedException e)   
	    {  
	        e.printStackTrace();  
	    }  
	    t2.start();  

	}

}
