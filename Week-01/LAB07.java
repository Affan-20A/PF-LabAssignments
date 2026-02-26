/*Write a program that prints the multiplication table of a number entered by the user.*/
import java.util.Scanner;
public class LAB07 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int Num = read.nextInt();
		int i = 1;
		while(i<=10) {
			System.out.println(Num + " x " + i + " = " + Num*i);
			i++;
		}
	}
}