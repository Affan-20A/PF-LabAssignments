/*Concept = Function Overloading
Make a Calculator class with overloading functions for basic operations on integer and double.*/
public class LAB04 {
	public static void main(String[] args) {
		double Add = Addition(1, 2);
		System.out.println(Add);
		double Sub = Subtraction(3.55, 2.33);
		System.out.println(Sub);
		double Mul = Multiplication(3.9, 10);
		System.out.println(Mul);
		double Div = Division(1, 2);
		System.out.println(Div);
	}
	static int Addition(int a, int b) {
		return a+b;
	}
	static int Subtraction(int a, int b) {
		return a-b;
	}
	static int Multiplication(int a, int b) {
		return a*b;
	}
	static double Division(int a, int b) {
		if(b!=0) {
			return 1.0*a/b;
		}
		else {
			System.out.println("Divisor cannot be Zero");
			return 0;
		}
	}
	static double Addition(double a, double b) {
		return a+b;
	}
	static double Subtraction(double a, double b) {
		return a-b;
	}
	static double Multiplication(double a, double b) {
		return a*b;
	}
	static double Division(double a, double b) {
		if(b!=0) {
			return a/b;
		}
		else {
			System.out.println("Divisor cannot be Zero");
			return 0;
		}
	}
}