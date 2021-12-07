package icici.loan.carloan;

public class HDFC implements Rbi{

	public static void main(String[] args) {
		
		HDFC ob=new HDFC();
		ob.withdrawl();
		ob.depposit();

	}

	@Override
	public void withdrawl() {
		
		System.out.println("Withdrawl amount from HDFC bank");
	}

	@Override
	public void depposit() {
		
		System.out.println("Deposit amount from HDFC bank");
	}

}
