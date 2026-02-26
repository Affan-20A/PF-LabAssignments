/*Concept = Functions and Methods
Write a function that prints multiplication table of a number.*/
import java.util.Scanner;
public class LAB02 {
	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
		System.out.print("Enter the Number you want the table of: ");
		int n = read.nextInt();
		System.out.print("Enter the Number you want the table up to: ");
		int limit = read.nextInt();
		
		printmultitable(n, limit);
	}
    static void printmultitable(int Num, int Lim) {
    	int i = 1;
    	while(i<=Lim) {
    		System.out.println(Num + " x " + i + " = " + Num*i);
			i++;
		}
    }
}