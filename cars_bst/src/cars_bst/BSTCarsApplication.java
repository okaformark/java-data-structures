package cars_bst;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class BSTCarsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Key;
		//Cars car;
		Node foundNode;

		/* create an empty binary tree */
		BSTCars bstCars = new BSTCars();
		
		File file = new File("C:\\Users\\markokafor\\eclipse-workspace\\cars_dll\\cars.txt");
		Scanner car = null;
		try {
			car = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		
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
			
			bstCars.Insert(newCar);
			//newCar.Output();
			System.out.println(newCar);
			System.out.println("\n");
		}
		car.close();
		bstCars.InOrder(bstCars.getroot());
		

		System.out.println("Root's data is " + bstCars.getroot().car);
		System.out.println("\n");
		System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for in-order display, 5 to exit");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3 || s == 4)
		{
			if (s == 1)
			{
				System.out.println("Enter the ID of the car that you want to search:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				foundNode = bstCars.Search(Key);
				if (foundNode == null)
				{
					System.out.println("There is nos such item.");
				}
				else
				{
					System.out.println("The car is found:");
					System.out.println(foundNode.car);
					System.out.println("\n");
				}
			};
			if (s == 2)
			{
				System.out.println("Enter a car that you want to insert:");
				Cars carToInsert = new Cars();
				carToInsert.Input();
				
				bstCars.Insert(carToInsert);
				
				System.out.println("The data of the current binary search tree in in-order.");
				bstCars.InOrder(bstCars.root);
				System.out.println("\n");
			};
			if (s == 3)
			{
				System.out.println("Enter the ID of the car that you want to delete:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				if (!(bstCars.Delete(Key) == true))
				{
					System.out.println("There is no such car.");
				}
				else
				{
					System.out.println("The car is deleted");
					System.out.println("The data of the current binary search tree in in-order.");
					bstCars.InOrder(bstCars.root);
					System.out.println("\n");
				}
			};
			if (s == 4)
			{
				bstCars.InOrder(bstCars.root);
			};
			System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for in-order display, 5 to exit");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.println("\n");
		}
		System.out.println("Goodbye!");

	}

}
