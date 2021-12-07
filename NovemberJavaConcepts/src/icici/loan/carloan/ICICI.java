package icici.loan.carloan;

public class ICICI implements Rbi{
	

	public static void main(String[] args) {
		
		ICICI ob=new ICICI();
		ob.withdrawl();
		ob.depposit();

	}

	@Override
	public void withdrawl() {
		
		System.out.println("Withdrawl amount from ICICI bank");
	}

	@Override
	public void depposit() {
		System.out.println("Deposit amount from ICICI bank");
		
	}

}
