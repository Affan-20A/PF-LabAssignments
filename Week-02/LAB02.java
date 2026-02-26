/*Write a program that checks if a word is a Palindrome or not.*/
import java.util.Scanner;
public class LAB02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String str = read.nextLine();
		boolean isPalindrome = true;
		int n = str.length();
		for (int i = 0, j = n-1 ; i < j ; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("The word is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}