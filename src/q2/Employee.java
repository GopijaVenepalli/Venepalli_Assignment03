package q2;

public class Employee {
	
	private String firstName;
    private String lastName;
    
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
        return lastName + ", " + firstName;   
    }
	
	protected void employer() {
        System.out.println("Amazon");
    }

	@Override
	public String toString() {
		return getFullName();
	}
	
	
    
    
	
	

}
