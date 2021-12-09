package icici.loan.homeloan;

import org.testng.reporters.jq.Main;

public class InstanceBlock {
	{
		System.out.println("Instance block-1 logics");
	}

	 public InstanceBlock() 
		
		{
			System.out.println("0-arg contructor logics");
		}
		
			{
				System.out.println("Instance block-2 logics");
			}
			public  InstanceBlock(int a)
			{
				System.out.println("1-arg contructor logics");
				
			
		}
		public static void main(String[] args) {
			
			new InstanceBlock();
			new InstanceBlock();
			new InstanceBlock(10);
			
		}
	}


