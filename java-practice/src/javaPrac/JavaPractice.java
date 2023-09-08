package javaPrac;


public class JavaPractice {
	
	public static int algo(int r, int q, int n) {
		if(n ==1) {
			return r;
		}
		else {
			if(n % 2 == 1) {
				return algo(r, q, n - 1) + (n-1) * q;
			}
			else {
				return algo(r, q, n -1) - (n-1)*q;
			}
		}
	}
	
	public static int algo1(int n) {
		int a; int b; int temp;
		if(n==0 || n ==1) {
			return 1;
		}
		else {
			a = 0;
			b=1;
			for(int i=2; i<n; i++) {
				temp = b;
				b+=a;
				a = temp;
				System.out.println(b);
			}
			return b;
		}
	}

	public static long Algo3(long n) {
		if((n==0) || (n==1)) {
			return n;
		}
		else {
			return Algo3(n-1) + Algo3(n -2);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("ans" + algo1(2));
//		algo1(10);
		System.out.println("JavaPractice.main()"+ Algo3(10)); 
	}

}
