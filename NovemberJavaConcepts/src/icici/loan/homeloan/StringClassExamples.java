package icici.loan.homeloan;

public class StringClassExamples {

	public static void main(String[] args) {
		
		
        // Immutability class		
		String str="Pandu";
		str.concat("Damera");
		System.out.println(str);
		
		//Mutability Class
		 StringBuffer st=new StringBuffer("Shashi");
		 st.append("Damera");
		 System.out.println(st);

	}

}
