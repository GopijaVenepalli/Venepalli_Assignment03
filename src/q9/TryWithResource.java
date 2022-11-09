package q9;

import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (	 
	            // Creating an object of FileOutputStream
				// Adding resource
	            FileOutputStream file = new FileOutputStream("input.txt")) {
	 
	            String s = "Hello";
	            
	            // Converting string to bytes
	            byte a[] = s.getBytes();
	 
	            // Text written in the file
	            file.write(a);
	    }
		// Catch block to handle exceptions
        catch (Exception e) {
            // Display message for the occurred exception
            System.out.println(e);
        }
 
        // Display message for successful execution of program
        System.out.println("Successful");
    }

	

}
