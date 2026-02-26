/*Concept = Class of Functions
Create a matrix calculation class that can:
1. Add two matrices
2. Subtract two matrices
3. Transpose a matrix
4. Check if a matrix is symmetric
5. Sum the diagonal elements*/

public class LAB07 {
	public static void main(String[] args) {
		int[][] mtrx1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] mtrx2 = {{9,8,7}, {6,5,4}, {3,2,1}};
		int[][] mtrx3 = {{5,2,9,1}, {2,0,3,7}, {9,3,8,4}, {1,7,4,2}};
		
		mtrxSum(mtrx1, mtrx2);
		System.out.println();
		mtrxDiff(mtrx1, mtrx2);
		System.out.println();
		mtrxTpose(mtrx1);
		System.out.println();
		mtrxTpose(mtrx2);
		System.out.println();
		
		boolean Sym = checkSymmetric(mtrx3);
		if(Sym) {
			System.out.println("This is Symmetric\n");
		}
		else {
			System.out.println("Not Symmetric\n");
		}
		
		int DiaSum = diagonalSum(mtrx3);
		System.out.println("The sum of diagonal elements is " + DiaSum);
	}
	
	static void printmtrx(int[][] C) {
		for(int i=0 ; i<C.length ; i++) {
			for(int j=0 ; j<C[i].length ; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
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
	static void mtrxDiff(int[][] A, int[][] B) {
		int[][] C = new int[A.length][A[0].length];
		for(int i=0 ; i<A.length ; i++) {
			for(int j=0 ; j<A[i].length ; j++) {
				C[i][j] = A[i][j] - B[i][j] ;
			}
		}
		printmtrx(C);
	}
	static void mtrxTpose(int[][] C) {
		int[][] D = new int[C.length][C[0].length];
		for(int i=0 ; i<C.length ; i++) {
			for(int j=0 ; j<C[i].length ; j++) {
				D[i][j] = C[j][i];
			}
		}
		printmtrx(D);
	}
	static boolean checkSymmetric(int[][] C) {
		boolean isSymmetric = true;
		for(int i=0 ; i<C.length ; i++) {
			for(int j=0 ; j<C[i].length ; j++) {
				if(C[i][j] != C[j][i]) {
					isSymmetric = false;
					break;
				}
			}
		}
		printmtrx(C);
		return isSymmetric;
	}
	static int diagonalSum(int[][] C) {
		int Sum = 0;
		for(int i=0 ; i<C.length ; i++) {
			Sum = Sum + C[i][i];
		}
		printmtrx(C);
		return Sum;
	}			
}