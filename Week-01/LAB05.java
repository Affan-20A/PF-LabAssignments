/*Write a program that checks if a year is leap or not.*/
import java.util.Scanner;
public class LAB05 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int Year = read.nextInt();
		if(Year%4==0 && Year%100!=0 || Year%400==0) {
			System.out.println("It is a Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}
}