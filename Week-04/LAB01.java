/*Concept = Functions and Methods
Write a function that adds two matrices and a function that prints a matrix.*/
public class LAB01 {
	public static void main(String[] args) {
		int[][] mtrx1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] mtrx2 = {{9,8,7}, {6,5,4}, {3,2,1}};
		mtrxSum(mtrx1, mtrx2);
	}
	static void mtrxSum(int[][] A, int[][] B) {
		int[][] C = new int[A.length][A[0].length];
		for(int i=0 ; i<A.length ; i++) {
			for(int j=0 ; j<A[i].length ; j++) {
				C[i][j] = A[i][j] + B[i][j] ;
			}
		}
		printmtrx(C);
	}
	static void printmtrx(int[][] C) {
		for(int i=0 ; i<C.length ; i++) {
			for(int j=0 ; j<C[i].length ; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}