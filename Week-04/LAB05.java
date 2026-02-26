/*Concept = Function Overloading (Varying Parameter Count)
Make a Class containing functions to find max value among two or three values.*/
public class LAB05 {
	public static void main(String[] args) {
		String r1 = Max(2, 1);
		System.out.println(r1);
		String r2 = Max(3, 3);
		System.out.println(r2);
		String r3 = Max(2, 4, 9);
		System.out.println(r3);
		String r4 = Max(6, 6, 6);
		System.out.println(r4);
	}
	static String Max(int a, int b) {
		if(a>b) {
			return String.valueOf(a);
		}
		else if(b>a) {
			return String.valueOf(b);
		}
		else {
			return "Both are Equal";
		}
	}
	static String Max(int a, int b, int c) {
		if(a>b && a>c) {
			return String.valueOf(a);
		}
		else if(b>a && b>c) {
			return String.valueOf(b);
		}
		else if(c>a && c>b) {
			return String.valueOf(c);
		}
		else {
			return "All are Equal";
		}
	}
}