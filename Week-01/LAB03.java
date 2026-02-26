/*Write a program that finds the greaest among three numbers entered by the user.*/
import java.util.Scanner;
public class LAB03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int A = read.nextInt();
		System.out.println("Enter 2nd number: ");
		int B = read.nextInt();
		System.out.println("Enter 3rd number: ");
		int C = read.nextInt();
		if(A>B && A>C){
			System.out.println(A + " is Greatest");
		}
		else if(B>A && B>C){
			System.out.println(B + " is Greatest");
		}
		else if(C>A && C>B){
			System.out.println(C + " is Greatest");
		}
		else {
			System.out.println("All are Equal");
		}
	}
}