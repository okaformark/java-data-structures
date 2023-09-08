package pQMaxHeap;

import java.util.Random;
import java.util.Scanner;


public class PQHeapApplication {

	public static void main(String[] args) {
		int x;
		
		Random rnd = new Random();
		System.out.println("Enter the capacity of the heap: ");
		int size = Integer.parseInt(new Scanner(System.in).nextLine());
		
		//MaxHeap H = new MaxHeap(size); // create a new heap H	
		PQMaxHeapClass PQH = new PQMaxHeapClass(size);
		
		System.out.printf("Enter the initial size of the heap: (<=%d) ", size);
		int currSize = Integer.parseInt(new Scanner(System.in).nextLine());
		
		
		System.out.println("The elements in the array before the heap is built:");
	
		for (int i = 0; i < currSize; i++) // assign integers to the array Arr
		{
			x = rnd.nextInt(101);
			PQH.AddToArray(x);			
			System.out.printf("%d  ",x);
		}
		
		System.out.println();
		PQH.BuildHeap(); // build the heap H from array Arr
		
		System.out.println("The elements in the heap are:");
		PQH.Display();

		System.out.println("Enter 1 to Extract Max, 2 for Insertion, 3 Display Heap, 4 Exit");
		
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s==3 || s==4)
		{
			if (s == 1)
			{
				int max = PQH.ExtractHighestPriority();
				if (max != -9999999)
				{
					System.out.println("The maximum element is:");
					System.out.println(max);
					System.out.println("The elements in the array after extracting the max:");
					PQH.Display();
				};
			};
			if (s == 2)
			{
				System.out.println("Insert a new item to the heap:");
				int newItem = Integer.parseInt(new Scanner(System.in).nextLine());
				PQH.Insert(newItem);
				System.out.println("The elements in the array after inserting the new item:");
				PQH.Display();
			};
			
			if (s == 3)
			{			
				System.out.println("The items in the heap are");
				PQH.Display();
					
			};
			if (s == 4)
			{				
				System.out.println("Goodbye!");
				return;
					
			};
			System.out.println("Enter 1 to Extract Max, 2 for Insertion, 3 Display Heap, 4 Exit");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}

	}

}
