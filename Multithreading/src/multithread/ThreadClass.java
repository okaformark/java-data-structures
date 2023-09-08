package multithread;

public class ThreadClass implements Runnable{
	
	private Thread thread;
	private String[] threadName;
	
	private int _row;
	private int _col;
	
	private int _i, _j;
	
	public ThreadClass(int row, int col, int i, int j) {
		_row = row;
		_col = col;
		_i = i;
		_j = j;
			
	}
	
	public ThreadClass(int len) {
		threadName=new String[len];
	}
//	
	public ThreadClass() {
//
	}
	public void setThreadName(String name) {
		System.out.println("Creating Thread "+ name);
		threadName[_i] = name;
		_i++;
	}
	
	@Override
	public void run() {
		Matrix.C[_i][_j] = 0;
		for(int k = 0; k < _row; k++) {
			if (thread == null) {
				thread = new Thread();
				System.out.println("Running on "+ thread.currentThread().getName());
				Matrix.C[_i][_j] += Matrix.A[_i][k] * Matrix.B[k][_j];
				
			}
		}
	}
	

	public void Start() {
		run();
	}
	
}
