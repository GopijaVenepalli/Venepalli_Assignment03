package q4;

public class Car extends Vehicle {
	
	// trying to override model() 
	void model() { 
    System.out.println("XUV");
    }
	
	// trying to override model() 
	//void manufactureYear() {
	      //System.out.println("2022");  //manufactureYear() in Car cannot override because the manufactureYear() method is static in Vehicle
	//}

}
