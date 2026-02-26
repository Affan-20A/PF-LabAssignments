/*Write a program that finds the factorial of a number.*/
import java.util.Scanner;
public class LAB02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number to calculate its factorial:  ");
		int Num = read.nextInt();
		int Fact = 1;
		while(Num >= 1) {
			Fact = Fact*Num;
			Num--;
		}
		System.out.println("The Factorial is " + Fact);
	}
}