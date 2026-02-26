/*Concept = Functions (Return a value)
Write a function that checks if an integer is a prime number, returns true if it is, otherwise false.*/
import java.util.Scanner;
public class LAB06 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a Prime number: ");
		int num = read.nextInt();
		boolean result = CheckPrime(num);
		if(result) {
			System.out.print("Prime Number");
		}
		else {
			System.out.print("Not a Prime");
		}
	}
	static boolean CheckPrime(int n) {
		boolean isPrime = true;
		if(n<=1) {
			isPrime = false;
		}
		else {
			for(int i=2 ; i<=n/2 ; i++) {
				if(n%i==0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
}