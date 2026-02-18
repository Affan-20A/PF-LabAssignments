/*Concept = Array
Write a program that finds the average of a student's result scores.*/
import java.util.Scanner;
public class LAB04 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter no. of Subjects: ");
		int n = read.nextInt();
		int[] scores = new int[n];
		for(int i=0 ; i<n ; i++) {
			System.out.println("Enter score of Subject " + (i+1) + ": ");
			scores[i] = read.nextInt();
		}
		int Sum = 0;
		for(int i=0 ; i<n ; i++) {
			Sum = Sum + scores[i];
		}
		double Avg = (double) Sum/n; // int/int -> int
		System.out.println("Sum is: "+ Sum);
		System.out.println("Average is: "+ Avg);
	}
}