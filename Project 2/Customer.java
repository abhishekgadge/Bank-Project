package Bank_Project;

public class Customer {
	long account_no;
	String customerName;
	
	public Customer(int account_no,String customerName) {
		super();
		this.account_no=account_no;
		this.customerName=customerName;
	}

	@Override
	public String toString() {
		return "Customer [account_no=" + account_no + ", customerName=" + customerName + "]";
	}

}
