/*Write a program that matches a password entered by the user and gives three atempts.*/
import java.util.Scanner;
public class LAB04 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String OGPass = "PaSS1234";
		int MaxAttempts = 3;
		int AttemptCount = 0;
		while(AttemptCount < MaxAttempts){
	   	System.out.println("Enter Password: ");
		   String Pass = read.nextLine();
		   AttemptCount++;
		   if(Pass.equals(OGPass)) {
		      System.out.println("Password Matched");
		      break;
		   }
		   else {
		      System.out.println("Invalid Password");
		   }
		}
	}
}