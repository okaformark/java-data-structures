package amzChallenge;


public class Amazon {
	public void maxOfMinima(int numComp, int [] hardSpace, int segLength){
		int col1 = hardSpace.length + 6 / segLength;
		int [][] arr = new int[col1][segLength + 5];
		 for (int i = 0; i < hardSpace.length -1; i++) {
			 arr[col1][i] = hardSpace[i];
			 arr[col1][(i + segLength - 1)] = hardSpace[i + (segLength -1)];
			 System.out.printf("{0}", arr[col1][i]);
//
//			  x[i] = hardSpace[i];
//			  x[i+ segLength - 1] = hardSpace[i+ segLength - 1];
//			  System.out.println(x[i]);
		} 
		
}
		
	public static void main(String[] args) {
		
		int []arr = new int[] {8,3,4,7};
		int a = 4;
		int b = 2;
		
		Amazon objAmazon = new Amazon();
		objAmazon.maxOfMinima(a, arr, b); //4
//		maxOfMinima(6, [8,2,4,3,-2,7], 3) //3
//		maxOfMinima(10, [2,8,7,9,14,7,4,7,8,9,55], 5) //7
	}

}
