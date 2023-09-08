package cars_dll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoubleLLApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int key, preKey;
		 
		File file = new File("C:\\Users\\markokafor\\eclipse-workspace\\cars_dll\\cars.txt");
		Scanner car = null;
		try {
			car = new Scanner(file);
//			String rrrString = car.nextLine();
//			System.out.println(rrrString);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//System.out.println(car);
			e.printStackTrace();
			
		}
		
		/* create an empty linked list */
		DoubleLL newCarLL = new DoubleLL();
		
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
			
			newCarLL.AppendToHead(newCar);
			newCar.Output();
			System.out.println("\n");
		}
		car.close();
		


		/* print the list */
		System.out.println("The following are the car data in the current linked list from the header:");

		newCarLL.PrintList();

		System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for append, 5 for remove,6 for append to tail, 7 for remove from tail, 8 for exit");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s==6 || s == 7 || s==8)
		{
			if (s == 1)
			{
				System.out.println("Enter an key/integer that you want to search:");
				key = Integer.parseInt(new Scanner(System.in).nextLine());
				Node searchedCar = newCarLL.Search(key);
				if (searchedCar != null)
				{
					System.out.printf("The car data is found: %1$s" + "\r\n", searchedCar.car);
				}
				else
				{
					System.out.println("there is no such key!");
				}
			};
			if (s == 2)
			{
				Cars carToInsert = new Cars();
				carToInsert.Input();
				
				System.out.println("Enter the preKey that the new car data will be inserted after:");
				preKey = Integer.parseInt(new Scanner(System.in).nextLine());
				
				newCarLL.Insert(carToInsert, preKey);
				
				System.out.println("The car data from the current linked list from the header is as follows:");
				newCarLL.PrintList();
			};
			if (s == 3)
			{
				System.out.println("Enter the ID/integer of the car that you want to delete:");
				key = Integer.parseInt(new Scanner(System.in).nextLine());
				
				newCarLL.Delete(key);
				
				System.out.println("The car data in the current linked list from the header is as follows:");
				newCarLL.PrintList();
			};
			if (s == 4)
			{
				System.out.println("Enter car data that you want to append:");
				Cars carToAppend = new Cars();
				carToAppend.Input();
				
				newCarLL.AppendToHead(carToAppend);
				
				System.out.println("The car data in the current linked list from the header is as follows:");
				newCarLL.PrintList();
			};
			if (s == 5)
			{
				Node RemovedNode = newCarLL.RemoveFromHead();
				if (RemovedNode != null)
				{
					System.out.printf("The removed item is: %1$s" + "\r\n", RemovedNode.car);
					System.out.println("The car data in the current linked list from the header is as follows: ");
					newCarLL.PrintList();
				}
				
				
				else
				{
					System.out.println("The car linked list is empty!");
				}
			};
			
			if (s == 6)
			{
				System.out.println("Enter the car data that you want to append to the tail:");

				Cars carToAppend = new Cars();
				carToAppend.Input();
				
				newCarLL.AppendToTail(carToAppend);
				System.out.println("The car data in the current linked list from the header is as follows: ");
				newCarLL.PrintList();
			};
			if (s == 7)
			{
				Node RemovedNode = newCarLL.RemoveFromTail();
				if (RemovedNode != null)
				{
					System.out.printf("The removed item is: %1$s" + "\r\n", RemovedNode.car);
					System.out.println("The car data in the current linked list from the header is as follows: ");
					newCarLL.PrintList();
				}
			};
			if (s == 8)
			{
				break;
			}

			System.out.println("\n");
			System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for append, 5 for remove,6 for append to tail, 7 for remove from tail, 8 for exit");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		System.out.println("Goodbye!");

	}

}
