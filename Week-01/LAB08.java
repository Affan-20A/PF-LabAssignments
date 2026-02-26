/*Write a program that finds the sum of digits entered by the user.
Example: Input = 12345 Output = 15*/
import java.util.Scanner;
public class LAB08 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		String Num = read.nextLine();
		int i = 0;
		int Sum = 0;
		while(i<Num.length()) {
			/*Sum = Sum + Num.charAt(i);
			This is an Error ... charAt gives Characters
			We fix it like this,
			Sum = Sum + Character.getNumericValue(Num.charAt(i));
			Or,
			Sum = Sum + (Num.charAt(i) - '0')
			i.e. 0 is a character here and subtracts the ASCII code ... Like if '5' - '0' their ASCII codes will be subtracted 53 - 48 which is equal to 5 itself ... (BOOM)*/
			Sum = Sum + (Num.charAt(i) - '0');
			i++;
		}
		System.out.println("The Sum of Digits is " + Sum);	
	}
}