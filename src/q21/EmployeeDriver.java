package q21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {    
			  //Creating the object    
			  Employee emp =new Employee(919,"Feroz");    
			  //Creating stream and writing the object    
			  FileOutputStream fos=new FileOutputStream("input.txt");    
			  ObjectOutputStream oos=new ObjectOutputStream(fos);    
			  oos.writeObject(emp);    
			  oos.flush();    
			  //closing the stream    
			  oos.close();    
			  System.out.println("success");    
		}
		catch(Exception e) {
			System.out.println(e);
			}    
			 
	}    

	

}
