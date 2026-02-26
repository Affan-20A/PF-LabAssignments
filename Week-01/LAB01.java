/*Write a program that sums up the natural numbers up to the number entered by the user.*/
import java.util.Scanner;
public class LAB01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int Num = read.nextInt();
		int i = 1;
		int Sum = 0;
		while(i <= Num) {
			Sum = Sum + i;
			i++;
		}
		System.out.println("The Sum of Natural Numbers from 1 to " + Num + " is " + Sum);
	}
}