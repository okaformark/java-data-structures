package cars_min_heap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MinHeapCarsApplication {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\markokafor\\eclipse-workspace\\cars_dll\\cars.txt");
		Scanner car = null;
		try {
			car = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Enter the capacity of the heap: ");
		int size = Integer.parseInt(new Scanner(System.in).nextLine());
		MinHeapCars minHeapCars = new MinHeapCars(size); // create a new heap H	

		
		while(car.hasNext()) {
			Cars newCar = new Cars();
			if(car.hasNextInt()) {
				newCar.ID = car.nextInt();
			};
			newCar.make = car.next();
			newCar.model = car.next();
			if(car.hasNextInt()) newCar.year = car.nextInt();	
			
			if(car.hasNextDouble()) {
				newCar.mileage = car.nextDouble();
			} 
			if(car.hasNextDouble()) newCar.price = car.nextDouble();
			
			minHeapCars.inputToArray(newCar);
			newCar.Output();
			System.out.println("\n");
		}
		car.close();
		
		
		System.out.println();
		minHeapCars.buildHeap(); 
		
		System.out.println("The cars in the heap are:");
		minHeapCars.displayHeap();

		System.out.println("Enter 1 for car with lowest price, 2 for heapInsert, 3 Heap Sort, 4 Exit");
		
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s==3 || s==4)
		{
			if (s == 1)
			{
				Cars max = minHeapCars.extractMin();
				if (max != null)
				{
					System.out.println("The car with the lowest price is:");
					System.out.println(max);
					System.out.println("The cars in the heap after extracting the max:");
					minHeapCars.displayHeap();
				};
			};
			if (s == 2)
			{
				System.out.println("Insert a new car to the heap:");
				Cars newCars = new Cars();
				newCars.Input();
				
				minHeapCars.heapInsert(newCars);
				System.out.println("The cars in the heap after insertion are");
				minHeapCars.buildHeap();
				minHeapCars.displayHeap();
			};
			
			if (s == 3)
			{
				int ans;
				System.out.println("Warning: After heap sort, current heap will not be restored and the application will end!");
				System.out.println("Continue with sorting? 1 for yes, 2 for no: \n");
				ans = Integer.parseInt(new Scanner(System.in).nextLine());
				if(ans==1){
					minHeapCars.heapSort();
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
