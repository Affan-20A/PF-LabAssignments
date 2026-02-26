/*Write a program that prints the reverse of the word entered by the user as input.*/
import java.util.Scanner;
public class LAB01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a Word: ");
		String str = read.nextLine();
		String reversed = "";
		int n = str.length();
		for (int i = 0 ; i<n ; i++) {
			char c = str.charAt(i);
			reversed = c + reversed;
		}
		System.out.print("Reversed Word: " + reversed);
	}
}