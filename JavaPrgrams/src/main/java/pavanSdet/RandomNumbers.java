package pavanSdet;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int ran=r.nextInt(100);
		System.out.println("Random Number are::"+ran);
		Double f=r.nextDouble();
		System.out.println("Random Number are::"+f);
		System.out.println("Random Number are::"+Math.random());
		
		

	}

}
