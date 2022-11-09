package q27;



public class Singleton {
	private static Singleton sst = null;
	
	public String str;   
	
	private Singleton(){
		str = "Hello!"; 
	}

	  public synchronized static Singleton getID()
	    {   
	        if(sst == null)
	            sst = new Singleton ();

	        return sst;
	    }

}
