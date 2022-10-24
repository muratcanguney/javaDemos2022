package objectOrientedProgramming;

public class CustomerManager {
	private Customer customer;
	private ICreditManager iCreditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.iCreditManager = creditManager;
	}

	public void save() {
		System.out.println("Müşteri Kaydedildi..");
	}

	public void delete() {
		System.out.println("Müşteri Silindi..");
	}
	
	public void giveCredit() {
		iCreditManager.save();
		System.out.println("Kredi Verildi..");
	}
}