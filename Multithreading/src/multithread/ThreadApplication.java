package multithread;


public class ThreadApplication {
	
	public static void main(String[] args) {
		
		long startTime;
		long endTime;
		
		long startTime2;
		long endTime2;
		
		startTime = System.currentTimeMillis();
		Matrix matrix = new Matrix();
		matrix.MatrixProduct();
		endTime = System.currentTimeMillis();
		
		long timeElapsed = endTime-startTime;
		System.out.println("Time elapsed for product of MATRIX A and B is" + timeElapsed);
	
		
		startTime2 = System.currentTimeMillis();
		Matrix2 matrix2 = new Matrix2(10,8000,8000,8);
		matrix2.MatrixProduct2();
		endTime2 = System.currentTimeMillis();
		
		long timeElapsed2 = endTime2 - startTime2;
		System.out.println("Time elapsed for product of MATRIX E and F is" + timeElapsed2);
		
	}
}
