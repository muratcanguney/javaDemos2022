package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.id = 1;
		customer.eMail = "abc@abc.com";

		Employee employee = new Employee();
		employee.id = 2;
		employee.salary = 5000;

		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.add();
		employeeManager.bestEmployee();
	}
}