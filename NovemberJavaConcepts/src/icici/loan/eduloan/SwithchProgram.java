package icici.loan.eduloan;

public class SwithchProgram {

	public static void main(String[] args) {
		
		int a=3;
		switch(a)
		
		{
		case 1: System.out.println("Are u in case 1");
		break;
		case 2: System.out.println("Are u in case 2");
		break;
		case 3: System.out.println("Are u in case 3");
		break; // Remove break means remaining cases will execute 
		case 4: System.out.println("Are u in case 4");
		break;
		default:System.out.println("No Such case is avaiable ");
		}

	}

}
