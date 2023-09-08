package multithread;
import java.util.Random;

public class Matrix {
	public static int [][] A,B,C;
	 public int Arow,Brow,Crow,Acol,Bcol,Ccol;
	 
	 public void Print(int [][] matrix) {
			System.out.println();
			int rows = matrix.length;
			int col = matrix[0].length;
			for(int i = 0; i < rows; i++) {
				for(int j=0; j< col; j++) {
					System.out.print(matrix[i][j]+" ");
					
				}
				System.out.println();
			}
	 }
	 
	 
	 public Matrix() {
		Arow = 10;
		Acol = 200;
		Brow = 200;
		Bcol = 8;
		
		A = new int[Arow][Acol];
		B = new int[Brow][Bcol];
		C = new int[Arow][Bcol];

		int count = 1;
		int count2 =1600;
		
		for(int i = 0;i < Arow; i++) {
			for (int j = 0; j < Acol;j++) {
				A[i][j] = count;
				count++;
			}
		}
		
		
		for(int i = 0;i <Brow; i++) {
			for (int j = 0; j <Bcol;j++) {
				B[i][j] = count2;
				count2--;
			}
		}

	}
	 
	 public void MatrixProduct() {
		 ThreadClass[][] matrix = new ThreadClass[Arow][Bcol];
		 
		 String [] threadName = {"T1","T2","T3","T4","T5","T6","T7","T8","T9","T10"};
			ThreadClass thread = new ThreadClass(threadName.length);
		 
		 for(int i = 0; i < Arow;i++) {
			 thread.setThreadName(threadName[i]);
			 for(int j = 0; j<Bcol; j++) {
				 matrix[i][j] = new ThreadClass(10, 8, i, j);
				 matrix[i][j].Start();
			 }
			
			 	System.out.println("\nA =");

	            Print(A);

	            System.out.println("\nB =");

	            Print(B);

	            System.out.println("\nC =");

	            Print(C);
		 }
	 }

}
	 
	 
