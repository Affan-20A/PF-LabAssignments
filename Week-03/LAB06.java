/*Concept = Array
Write a program that counts even and odd numbers in the array and prints them.*/
import java.util.Scanner;
public class LAB06 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
		int even_count = 0;
		int odd_count = 0;
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		System.out.println("Even Count = " + even_count);
		System.out.println("Odd Count = " + odd_count);
	}
}