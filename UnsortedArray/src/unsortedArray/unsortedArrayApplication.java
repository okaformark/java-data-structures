package unsortedArray;
import java.util.*;

public class unsortedArrayApplication
{
	public static void main(String args[])
	{
		int capacity, n, s = 0, position;
		double key;
		double item;
		
		System.out.println("Enter the capacity of the array:");
		capacity = Integer.parseInt(new Scanner(System.in).nextLine());
		
		unsortedArrayAccess arrApp = new unsortedArrayAccess(capacity);
		
		do {
			
			System.out.printf("Enter the size of the dataset (<= %d): ", capacity);
			n = Integer.parseInt(new Scanner(System.in).nextLine());
			
		}
		while(n > capacity);
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter an item");
			item = Double.parseDouble(new Scanner(System.in).nextLine());
			arrApp.append(item);
		};
		
		System.out.println("The items in the array");
		arrApp.display();
		
		
		while(s!=1 || s!=2 || s!=3 || s!=4 || s!=5) {
			System.out.println("Enter 1 for search, 2 for append, 3 for delete, 4 for remove, 5 for exit");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		
			while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5)
			{
				if (s == 1)
				{
					System.out.println("Enter the item for search");
					key = Double.parseDouble(new Scanner(System.in).nextLine());
					position = arrApp.search(key);
					if (position != -1)
					{
						System.out.printf("The index of the searching item in the array is %1$s" + "\r\n", position);
						System.out.printf("The  searching item in the array is %1$s" + "\r\n", arrApp.arr[position]);
					}
				};
				if (s == 2)
				{
					if(arrApp.arraySize == capacity)
					{
						System.out.println("The array is full!\n");
					}
					else
					{
						System.out.println("Enter the item for append");
						item = Double.parseDouble(new Scanner(System.in).nextLine());
						arrApp.append(item);
						System.out.println("The items in the array");
					}
					arrApp.display();
				};
				if (s == 3)
				{
					System.out.println("Enter the item for delete");
					key = Double.parseDouble(new Scanner(System.in).nextLine());
					arrApp.deletion(key);
					System.out.println("The items in the array");
					arrApp.display();
				};

				if (s == 4)
				{
					double y = arrApp.remove();
					if (y != -1)
					{
						System.out.printf("%f has been removed!\n", y);
					}
					arrApp.display();
				};
				if (s == 5) {
					System.out.println("GOODBYE!");
					System.exit(0);
				}
				
				System.out.println("Enter 1 for search, 2 for append, 3 for delete, 4 for remove, 5 for exit");
				s = Integer.parseInt(new Scanner(System.in).nextLine());
			}
			//System.out.println("Goodbye!");
		}
		
	}
}
