/*Concept = Array
Write a program that loops over an array of integers and prints the sum of that array.*/
import java.util.Scanner;
public class LAB01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] Array = {1, 2, 3, 4, 5, 10, 10, 15, 20, 30}; 
		int Sum = 0;
		for(int i=0 ; i<10 ; i++) {
			Sum = Sum + Array[i];
		}
		System.out.println("Sum is: "+ Sum);
	}
}