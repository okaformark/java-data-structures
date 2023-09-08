package multithread;
import java.util.Random;

public class Matrix2 {
	public static int [][] D,E,F;
	
	 public int Erow,Frow,Drow,Ecol,Fcol,Dcol;
	 
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
	 
	 
	 
	 public Matrix2(int row,int col, int row1, int col1) {
			Erow = row;
			Ecol = col;
			Frow = row1;
			Fcol = col1;
			
			D = new int[Erow][Fcol];
			E = new int[Erow][Ecol];
			F =new int [Frow][Fcol];		
			
			Random r = new Random();
			
			for(int i = 0;i < Erow; i++) {
				for (int j = 0; j < Ecol;j++) {
					E[i][j] = r.nextInt(101);
				}
			}
			
			
			for(int i = 0;i <Frow; i++) {
				for (int j = 0; j <Fcol;j++) {
					F[i][j] = r.nextInt(101);
				}
			}

		}
	
	 
	 public void MatrixProduct2() {
		 ThreadClass2[][] matrix = new ThreadClass2[Erow][Fcol];
		 
		 String [] threadName = {"T1","T2","T3","T4","T5","T6","T7","T8","T9","T10"};
			ThreadClass2 thread = new ThreadClass2(threadName.length);
		 
		 for(int i = 0; i < Erow;i++) {
			 thread.setThreadName(threadName[i]);
			 for(int j = 0; j<Fcol; j++) {
				 matrix[i][j] = new ThreadClass2(10, 8, i, j);
				 matrix[i][j].Start();
			 }
	
			 	System.out.println("\nE =");

	            Print(E);

	            System.out.println("\nF =");

	            Print(F);

	            System.out.println("\nD =");

	            Print(D);
		 }
	 }

}
	 
	 
