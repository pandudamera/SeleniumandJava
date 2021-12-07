package icici.loan.eduloan;

public class OperatorPrograms {

	public static void main(String[] args) {

		// Arithmetic Operator

		float a = 100, b = 20;

		System.out.println("**********Arithmetic Operator**********");

		System.out.println("Addition:" + (a + b));
		System.out.println("Subtration:" + (a - b));
		System.out.println("Multiplication:" + (a * b));
		System.out.println("Division:" + (a / b)); // Quotient
		System.out.println("Module:" + (a % b)); // Remainder

		// Unary Operator

		System.out.println("**********Unary Operator**********");

		int c = 10;
		System.out.println(c++); // Post increment print 10, internal increment
		System.out.println(c); // 10+1=11 // increment value

		System.out.println(++c); // Pre increment by 1 print 11+1= 12
		System.out.println(c); // 12

		System.out.println(c--); // Post decrement print 12, internal decrement
		System.out.println(c); // 12-1=11 // increment value

		System.out.println(--c); // Pre decrement by 1 print 11-1= 10
		System.out.println(c); // 10

		// Not Operator

		boolean bv = true;
		System.out.println((!bv)); // True opposite false

		// Shift Operator

		System.out.println("**********Shift Operator**********");

		int fg = 10;
		// Original 10 Binary 001010= left side shift two zeros 001010 00 00=40
		System.out.println(fg << 2); // Left shift 10*2^2=10*4=4=

		// Original 001010 right shift two zeros 000010=2
		System.out.println(fg >> 2); // Right shift 10/2^2=10/4=2

		System.out.println(fg >>> 2); // 2

		// Relation Operator
		int f = 13, g = 12, h = 11, j = 10;

		System.out.println("**********Relation Operator**********");

		System.out.println(f >= g); // True
		System.out.println(f == g); // False
		System.out.println(f != g); // True
		System.out.println(h < j); // False

		// Assignment Operator

		int k;

		System.out.println("**********Assignment Operator**********");

		System.out.println(k = 5);
		System.out.println(k += 1); // k=k+1 --->5+1=6
		System.out.println(k *= 3); // k=k*3--->6*3=18
		System.out.println(k = 1);
		System.out.println(k &= 2); // k=k&2

		// 1--binary> 0 1 2---> Binary 1 0
		// Bitwise Operator both value is same return true means 1 , both values
		// (different) not same return false means 0

		// Logical Operator

		System.out.println("**********Logical Operator**********");

		int l = 11, z = 10, x = 9;

		System.out.println(l > z && l < x); // T F F
		System.out.println(l > z || l < x); // T F T (Negative side)

		// Bitwise Operator

		System.out.println("**********Bitwise Operator**********");

		int v = 10, n = 5, m = 3;

		System.out.println(v | m); // 1010 0011 =1011=11
		System.out.println(v & m); // 1010 0011 =1010=2

		// Bitwise Operator and Logical Operator

		System.out.println("**********Logical Operator and Bitwise Operator **********");

		int gl = 10, gz = 5, gx = 3;

		System.out.println(gl < gz && gl++ > gx); // F T F
		System.out.println(gl); // 10
		System.out.println(gl < gz & gl++ > gx); // F T F (Negative side)
		System.out.println(gl); // 11

		// Bitwise Operator and Logical Operator || OR |

		System.out.println("**********Logical Operator and Bitwise Operator OR Operator **********");

		int glh = 10, gzh = 5, gxh = 3;

		System.out.println(glh > gzh || glh++ < gxh); // T F T
		System.out.println(glh); // 10
		System.out.println(glh > gzh | glh++ < gxh); //T F T
		System.out.println(glh);
		
		// Bitwise XOR and Complimentary Operator
		
		System.out.println("**********Bitwise XOR and Complimentary Operator **********");
		
		int glhj = 10, gxhg = 3;
		System.out.println(glhj^gxhg); // Bitwise XOR 1010 0011=1011 =9
		System.out.println(~glhj);// Bitwise Complimentary
		
		// Ternary Complimentary
		
		int glhjk= 10, gzhjk = 5;
		
		System.out.println("**********Ternary Operator **********");
		int max=(glhjk>gzhjk?glhjk:gzhjk);
		System.out.println(max);
		
		

	}

}
