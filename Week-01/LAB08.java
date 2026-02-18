/*Concept = Array
Write a program that reverses the contents of the array, without creating a second array. Print the array before and after.*/
import java.util.Scanner;
public class LAB08 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.print("Before: ");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\nAfter: ");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[arr.length-(i+1)] + " ");
		}
	}
}