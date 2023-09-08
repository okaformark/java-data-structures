package heap;

import java.util.Scanner;

public class EmployeeMaxheapApplication {
	public static String name; public static int id; public static double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the capacity of the heap: ");
		int size = Integer.parseInt(new Scanner(System.in).nextLine());
		EmployeeMaxHeap H = new EmployeeMaxHeap(size); // create a new heap H	
		
		System.out.printf("Enter the initial size of the heap: (<=%d) ", size);
		int currSize = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("The elements in the array before the heap is built:");
		
		for(int i = 0; i<currSize; i++) {
			Employee employee = new Employee();
			employee.Input();
			H.inputToArray(employee);
		}
		
		System.out.println();
		H.buildHeap(); // build the heap H from array Arr
		System.out.println("The elements in the heap are:");
		H.displayHeap();
		
System.out.println("Enter 1 for extractMax, 2 for heapInsert, 3 Heap Sort, 4 Exit");
		
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s==3 || s==4)
		{
			if (s == 1)
			{
				Employee max = H.extractMax();
				if (max != null)
				{
					System.out.println("The employee with maximum ID is:");
					System.out.println(max);
					System.out.println("The elements in the array after extracting the max:");
					H.displayHeap();
				};
			};
			if (s == 2)
			{
				System.out.println("Insert a new employee to the heap:");
				Employee employee = new Employee();
				employee.Input();
				//int newItem = Integer.parseInt(new Scanner(System.in).nextLine());
				H.heapInsert(employee);
				System.out.println("The employees in the array after inserting the new employee:");
				H.displayHeap();
			};
			
			if (s == 3)
			{
				int ans;
				System.out.println("Warning: After heap sort, current heap will not be restored and the application will end!");
				System.out.println("Continue with sorting? 1 for yes, 2 for no: \n");
				ans = Integer.parseInt(new Scanner(System.in).nextLine());
				if(ans==1){
					H.heapSort();
					System.out.println("Goodbye!");
					return;
				}
			};
			if (s == 4)
			{				
				System.out.println("Goodbye!");
				return;
					
			};
			System.out.println("Enter 1 for extractMax, 2 for heapInsert, 3 Heap Sort, 4 Exit");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}

	}

}
