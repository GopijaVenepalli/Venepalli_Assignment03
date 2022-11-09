package q7;

public class Calc {

	public String name;
	public int hoursWorked;
	public double hourlyRate;
	
	//public final Calc(){
	      //this.name = "Gopija";
	      //this.hoursWorked = 20;
	      //this.hourlyRate = 11.75;
	//}


	public double calcSalary() {
		return hoursWorked * hourlyRate;
	}
}
