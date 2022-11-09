package q12;

public class Finalize {
	
	public static void main(String[] args)   
    {   
        Finalize f = new Finalize();   
        System.out.println(f.hashCode());   
        f = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("End of garbage collection");   
  
    } 
	
    @Override  
    protected void finalize()   
    {   
        System.out.println("Hello");   
    }   

}
