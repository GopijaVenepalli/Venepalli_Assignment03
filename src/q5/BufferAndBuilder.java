package q5;

public class BufferAndBuilder {

	public static void main(String[] args) {
		
	    long startTime = System.currentTimeMillis();  
		StringBuffer buffer=new StringBuffer("Hello");  
        buffer.append(" world");  
        System.out.println(buffer); 
        for (int i=0; i<10; i++){  
            buffer.append(" !");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        
        startTime = System.currentTimeMillis();  
        StringBuilder builder=new StringBuilder("Hi");  
        builder.append(" there");  
        System.out.println(builder); 
        for (int i=0; i<10; i++){  
            buffer.append(" !");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms"); 
		

	}

}
