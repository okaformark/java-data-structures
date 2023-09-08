package heap;
import java.util.*;

public class HeapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		System.out.println("Enter the capacity of the heap: ");
		int size = Integer.parseInt(new Scanner(System.in).nextLine());
		MaxHeap H = new MaxHeap(size); // create a new heap H	
		
		System.out.printf("Enter the initial size of the heap: (<=%d) ", size);
		int currSize = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("The elements in the array before the heap is built:");
		
		//int []x = {95,77,43,66,64,25,44,11,10,47};
		H.inputToArray(95);
		H.inputToArray(77);
		H.inputToArray(43);
		H.inputToArray(66);
		H.inputToArray(64);
		H.inputToArray(25);
		H.inputToArray(44);
		H.inputToArray(11);
		H.inputToArray(10);
		H.inputToArray(47);
//		for (int i = 0; i < currSize; i++) // assign integers to the array Arr
//		{
//			int x = 1+ rnd.nextInt(100);
//			H.inputToArray(x);			
//			System.out.printf("%d  ",x);
//		}
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
				int max = H.extractMax();
				if (max != -9999999)
				{
					System.out.println("The maximum element is:");
					System.out.println(max);
					System.out.println("The elements in the array after extracting the max:");
					H.displayHeap();
				};
			};
			if (s == 2)
			{
				System.out.println("Insert a new item to the heap:");
				int newItem = Integer.parseInt(new Scanner(System.in).nextLine());
				H.heapInsert(newItem);
				System.out.println("The elements in the array after inserting the new item:");
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
