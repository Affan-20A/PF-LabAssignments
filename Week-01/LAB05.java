/*Concept = Array
Write a program that finds and prints the largest number in the array.*/
import java.util.Scanner;
public class LAB05 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] values = {34, 71, 12, 98, 45, 23};
		int largest = values[0];
		for(int i=1 ; i<values.length ; i++) {
			if(values[i] > largest) {
				largest = values[i];
			}
		}
		System.out.println("Largest = " + largest);
	}
}