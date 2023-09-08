package cars_LIFOstack_sll;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Stack_LL_Cars {
	LinkedList llCars = null;
	
	public Stack_LL_Cars() {
		llCars = new LinkedList();
	}

	public void Push(Cars newCar) {
		llCars.Append(newCar);
	}
	
	public Node Pop() {
		return llCars.Remove();
	}
	
	public void Print() {
		llCars.PrintList();
	}
	
	public static void main(String args[]) {
		
		int flag;
		File file = new File("C:\\Users\\markokafor\\eclipse-workspace\\cars_dll\\cars.txt");
		Scanner car = null;
		try {
			car = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		 Stack_LL_Cars stackCarLL = new Stack_LL_Cars(); 
		
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
			
			stackCarLL.Push(newCar);
			//newCar.Output();
			//System.out.println("\n");
		}
		car.close();
		
		System.out.println("The car data in the stack are as follows: ");
		System.out.println("\n");
		stackCarLL.Print();

		System.out.println("\n");
		System.out.println("Enter 1 to pop, 2 to push, 3 to exit");
		flag = Integer.parseInt(new Scanner(System.in).nextLine());
		
		while (flag != 3)
		{
			if (flag == 1)
			{
				Node nodeToPop = stackCarLL.Pop();
				if(nodeToPop != null) {
					
					System.out.printf("the item popped out is: %1$s" + "\r\n", nodeToPop.car);
					System.out.println("\n");
					System.out.println("The items in the Stack  after poping are:");
					System.out.println("\n");
					stackCarLL.Print();
				}
			}
			else
			{
				if (flag == 2)
				{
					System.out.println("Enter an integer to push it into the Stack:");
					Cars carToPush = new Cars();
					carToPush.Input();
					
					stackCarLL.Push(carToPush);
					System.out.println("The items in the Stack  after pushing are:");
					stackCarLL.Print();

				}
			}
			System.out.println("\n");
			System.out.println("Enter 1 to pop, 2 to push, 3 to exit");
			flag = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		System.out.println("End of testing. Goodbye!");
	}
}
