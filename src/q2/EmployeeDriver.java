package q2;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee("Gopija","Venepalli");
		System.out.println(emp.getFullName());
		emp.employer();

		HourlyEmployee hrEmp = new HourlyEmployee("Gopija","V",15,10.00);
		System.out.println(hrEmp.getFullName());
		hrEmp.employer();
	}

}
