package q2;

public class HourlyEmployee extends Employee {
	 private int numOfHoursWorked;
	 private double wagePerHour;
	
	 public HourlyEmployee(String firstName, String lastName, int numOfHoursWorked, double wagePerHour) {
		super(firstName, lastName);
		this.numOfHoursWorked = numOfHoursWorked;
		this.wagePerHour = wagePerHour;
	 }

	public int getNumOfHoursWorked() {
		return numOfHoursWorked;
	}

	public void setNumOfHoursWorked(int numOfHoursWorked) {
		this.numOfHoursWorked = numOfHoursWorked;
	}

	public double getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	 
	@Override
	public String getFullName(){
        return super.getFirstName() + " " + super.getLastName();
    }
	
	@Override
	public void employer() {
        System.out.println("Amazon");
    }
	
	public double calcSalary(){
        return numOfHoursWorked * wagePerHour;
    }


	@Override
	public String toString() {
		return  super.toString() + calcSalary();
	}
	
	
	 
	 

}
