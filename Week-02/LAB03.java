/*Write a program that continuously takes a number from the user until the user enters zero, and then sums up the numbers.*/
import java.util.Scanner;
public class LAB03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int Sum = 0;
		while (true) {
			System.out.print("Enter a Number: ");
			int Num = read.nextInt();
			if (Num == 0) {
				break;
			}
			Sum += Num;
		}
		System.out.print("The sum is " + Sum);
	}
}