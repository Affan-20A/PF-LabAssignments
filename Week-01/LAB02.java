/*Concept = 2D Array
Write a program that takes a matrix from user and prints its transpose.*/
import java.util.Scanner;
public class LAB02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter no. of Rows: ");
		int rows = read.nextInt();
		System.out.println("Enter no. of Columns: ");
		int columns = read.nextInt();
		int[][] mtrx = new int[rows][columns];
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<columns ; j++) {
				System.out.println("Enter [" +(i+1)+ "][" +(j+1)+ "] element: ");
				mtrx[i][j] = read.nextInt();
			}
		}
        System.out.println("Original Matrix");
        for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(mtrx[i][j] + " ");
			}
			System.out.println();
		}
        System.out.println("Tranpose of Original Matrix");
		for(int i=0 ; i<3 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				System.out.print(mtrx[j][i] + " ");
			}
			System.out.println();
		}
	}
}