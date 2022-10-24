package interfacesL3H2;

public class CustomerManager {
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.Add();
	}
}