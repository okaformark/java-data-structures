package linkedListEmployee;

import java.util.Scanner;

public class LinkedListEmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Key, preKey;
		Employee newEmployee;

		/* create an empty linked list */
		LinkedListEmployee linkedList = new LinkedListEmployee();
		
		System.out.println("Create a linkedlist of 5 employees");
		
		for(int i=0;i<5;i++) {
			// creates an employee object
			Employee newEmployeeObj = new Employee();
			System.out.println("Enter employee data");
			newEmployeeObj.Input();
			linkedList.Append(newEmployeeObj);
		}


		/* print the list */
		System.out.println("The following are the emloyee data in the current linked list from the header:");
		System.out.println();

		linkedList.ShowLinkedList();
		System.out.println();

		System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for append, 5 for remove, 6 for Average salary, 7 for Employee with max. salary");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s==6 || s == 7)
		{
			if (s == 1)
			{
				System.out.println("Enter an employee id that you want to search:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				Node n = linkedList.SearchEmployee(Key);
				if (n != null)
				{
					System.out.printf("The item/integer is found: %1$s" + "\r\n", n.employee);
				}
				else
				{
					System.out.println("there is no such key!");
				}
			};
			if (s == 2)
			{
				System.out.println("Enter a new employee that you want to insert:");
				newEmployee = new Employee();
				newEmployee.Input();
				System.out.println("Enter the preKey/integer that the new employee will be inserted after: ");
				preKey = Integer.parseInt(new Scanner(System.in).nextLine());
				linkedList.Insert(newEmployee, preKey);
				System.out.println("The employees in the current linked list from the header:");
				linkedList.ShowLinkedList();
			};
			if (s == 3)
			{
				System.out.println("Enter the key/integer of the employee that you want to delete:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				linkedList.Delete(Key);
				System.out.println("The employees in the current linked list from the header.");
				linkedList.ShowLinkedList();
			};
			if (s == 4)
			{
				System.out.println("Enter hte new employee data that you want to append:");
				newEmployee = new Employee();
				newEmployee.Input();
				linkedList.Append(newEmployee);
				System.out.println("The employees in the current linked list from the header");
				linkedList.ShowLinkedList();
			};
			if (s == 5)
			{
				Node RemoveNode = linkedList.Remove();
				if (RemoveNode != null)
				{
					System.out.printf("The removed item is: %1$s" + "\r\n", RemoveNode.employee);
					System.out.println("The items/integers in the current linked list from the header");
					linkedList.ShowLinkedList();
				}
				else
				{
					System.out.println("The linked list is empty!");
				}
			};
			if (s == 6) {
				System.out.printf("The salary is: %1s", linkedList.Average());
			};
			
			if (s == 7) {
				linkedList.ShowLinkedList();
				Employee employee = linkedList.SearchEmployeeWithHighestSalary();
				System.out.println("Employee with the hihest salary is: " + employee);
			};
			
			if (s == 9)
			{
				break;
			}

			System.out.println("\n");
			System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for append, 5 for remove, 6 for Average salary, 7 for Employee with max. salary");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		System.out.println("Goodbye!");

	}


}
