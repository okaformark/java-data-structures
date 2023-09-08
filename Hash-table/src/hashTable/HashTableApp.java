package hashTable;
import java.util.*;
public class HashTableApp {
		static int num;
		public static void enterNumOfEmployee() {
			System.out.println("Enter number of employees");
			num = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		private static char ShowMenu()
		{
			System.out.println("\nEnter the letter of operation: \n(o)Output\n(i)Insert\n(s)Search\n(d)Deletion\n(e)Exit\n(h)Highest Node\n(a)Average\n");
			return new Scanner(System.in).next().charAt(0);
		}
		public static void main(String[] args)
		{
			enterNumOfEmployee();
			HashTableClass hT= new HashTableClass();
			for(int i = 0; i < num; i++) {
				
				Employee employee = new Employee();	
				hT.Insert(employee);
			}
			hT.PrintHashTable();

			System.out.println("testing Hash Table \n");
			char sel = ' ';

			while (sel != 'E' && sel != 'e')
			{
				sel = ShowMenu();
				switch (sel)
				{
					case 'i':
					case 'I':
//						System.out.print("Enter an employee to insert: ");
						Employee emp = new Employee();
						//int x = Integer.parseInt(new Scanner(System.in).nextLine());
						hT.Insert(emp);
						break;
					case 's':
					case 'S':
						int k;
						System.out.print("Enter the number to search: ");
						k = Integer.parseInt(new Scanner(System.in).nextLine());
						Node ret = hT.Search(k);

						if (ret == null)
						{
							System.out.println("Not found!");
						}
						else
						{
							System.out.printf("The number %1$s is found.\r\n", k);
						}
						break;
					case 'o':
					case 'O':
						System.out.println("The current data in the hash table:  ");
						hT.PrintHashTable();
						break;
					case 'd':
					case 'D':
						int del;
						System.out.print("Enter the number to delete: ");
						del = Integer.parseInt(new Scanner(System.in).nextLine());
						System.out.println("Before delete, the hash table is:");
						hT.PrintHashTable();
						hT.Delete(del);
						System.out.println("After delete, the hash table is:");
						hT.PrintHashTable();
						break;
					case 'h':
					case 'H':
						System.out.println("The employee with the highest salary is" + hT.SearchNodeWithLargestKey());
					case 'a':
					case 'A':
						System.out.println("Average salary is: " + hT.Average());
					case 'e':
					case 'E':
						System.out.println("End of the testing. Goodbye!\n");
						break;
					default:
						System.out.println("Invalid input!");
						break;
				}
			}

		}

}
