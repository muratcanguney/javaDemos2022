package interfacesL3H2;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal = new OracleCustomerDal();
		customerDal.Add();
		OracleCustomerDal customerDal2 = new OracleCustomerDal();
		customerDal2.delete();

		CustomerManager customerManager = new CustomerManager(customerDal);
		customerDal.Add();
	}
}