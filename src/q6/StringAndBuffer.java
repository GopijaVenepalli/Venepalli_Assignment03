package q6;

public class StringAndBuffer {

	 public static String book() {         
		 String book = "Outliers"; 
	     String author = "Malcolm Gladwell";
	     for(int i=0; i<1000; i++) {  
	          book = book + "-" + author;  
	     }  
	     return book;  
	 }  
	 
	 public static String bookbuffer(){  
	        StringBuffer buffer = new StringBuffer("Outliers");  
	        for(int i=0; i<1000; i++){  
	        	buffer.append("-");
	            buffer.append("Malcolm Gladwell");  
	        }  
	        return buffer.toString();  
	 } 
	 
	 
	 public static void main(String[] args){  
	        long startTime = System.currentTimeMillis();  
	        book();  
	        System.out.println("Time taken by Concating with book: "+(System.currentTimeMillis()-startTime)+"ms");  
	        
	        startTime = System.currentTimeMillis();  
	        bookbuffer();  
	        System.out.println("Time taken by Concating with StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
	 }  
	 
}  

