/*Concept = Array
Write a program that searches for a target number in the array. Prints the index where it was found and prints "Not Found" if it is not in the array.*/
import java.util.Scanner;
public class LAB07 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] nums = {14, 27, 35, 48, 56};
		int target = 35;
		boolean search = false;
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]==35) {
				System.out.println("Found at index: " +i);
				search = true;
				break;
			}
		}
		if(search==false) {
			System.out.println("Not Found");
		}
	}
}