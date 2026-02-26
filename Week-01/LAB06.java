/*Write a program that finds the average of the values entered by the user.*/
import java.util.Scanner;
public class LAB06 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter No. of Values to find Average: ");
		int n = read.nextInt();
		int i = 1;
		int Sum = 0;
		while(i<=n) {
			System.out.println("Enter Number: ");
			int Num = read.nextInt();
			Sum = Sum + Num;
			i++;
		}
		double Avg = 1.0*Sum/n;  // (int/int = int)
		System.out.println("The Sum is " + Sum);
		System.out.println("The Average is " + Avg);
	}
}