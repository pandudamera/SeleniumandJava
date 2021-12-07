package com.test;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		
		p.method1();
		p.method2();
		
		Child c=new Child();
		c.method1();
		c.method2();
		c.method2();
		
		Parent pc=new Child();
		//Parent class reference can hold child object but child class referee variable can't hold parent class object
		//pc has ability to call all parent class methods and overridden methods of child class methods
		pc.method1();
		//In order to access child class methods with pc we have to type cast pc to child class
		((Child)pc).method2();
		((Child)pc).method3();
		
		

	}

}
