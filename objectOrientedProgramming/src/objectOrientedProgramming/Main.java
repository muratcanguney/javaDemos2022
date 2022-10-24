package objectOrientedProgramming;

public class Main {

	public static void main(String[] args) {
		/*CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Company company = new Company();
		company.setId("2");
		company.setCompanyName("Arçelik");
		company.setTaxNumber("0000");
		company.setCity("Eskişehir");
		
		CustomerManager customerManager = new CustomerManager(company);
		customerManager.save();
		customerManager.delete();*/
		
		Person person = new Person();
		person.setFirstName("Murat");
		person.setLastName("Güney");
		person.setNationalIdentity("12345");
		
		/*CustomerManager customerManager2 = new CustomerManager(person);
		customerManager2.save();
		customerManager2.delete();*/
		
		CustomerManager customerManager = new CustomerManager(person, new TeacherCreditManager());
		customerManager.giveCredit();
	}
}