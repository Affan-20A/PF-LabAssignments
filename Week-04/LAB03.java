/*Concept = Functions and Methods
Write a function that adds three matrices and stores the resultant matrix.*/
public class LAB03 {
	public static void main(String[] args) {
		int[][] mtrx1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] mtrx2 = {{9,8,7}, {6,5,4}, {3,2,1}};
		int[][] mtrx3 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] result = mtrxSum(mtrx1, mtrx2);
		int[][] resultfinal = mtrxSum(result, mtrx3);
		printmtrx(resultfinal);
	}
	static int[][] mtrxSum(int[][] A, int[][] B) {
		int[][] C = new int[A.length][A[0].length];
		for(int i=0 ; i<A.length ; i++) {
			for(int j=0 ; j<A[i].length ; j++) {
				C[i][j] = A[i][j] + B[i][j] ;
			}
		}
		return C;
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