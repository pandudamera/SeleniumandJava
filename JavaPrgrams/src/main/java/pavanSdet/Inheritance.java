package pavanSdet;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// case1
		Parent p = new Parent();
		p.m1();
		// p.m2(); child class methods can not hold the parent class object

		// case2
		Child c = new Child();
		c.m1();
		c.m2();

		// case3
		Parent p1 = new Child();
		p1.m1();
		// p1.m2(); Reference of parent class can not hold the objects of child class
		// methods

		// case4
		// Child c1 = new Parent(); can not convert child class to parent class

	}

}