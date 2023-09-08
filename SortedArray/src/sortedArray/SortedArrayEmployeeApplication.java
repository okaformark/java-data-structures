package sortedArray;

import java.util.Scanner;

public class SortedArrayEmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int capacity, n, s = 0, position;
		int key;
		double item;
		
		System.out.println("Enter the capacity of the employee array:");
		capacity = Integer.parseInt(new Scanner(System.in).nextLine());
		
		SortedArrayEmployee employeesArrayEmployee = new SortedArrayEmployee(capacity);
		
		System.out.printf("Enter the number of employees (<= %d): ", capacity);
		n = Integer.parseInt(new Scanner(System.in).nextLine());
		
		
		while(true) {
			
			if(n>capacity) {
				
				System.out.println("Number of employees can mot be greater than size of the array");
				System.out.printf("Enter the number of employees (<= %d): ", capacity);
				n = Integer.parseInt(new Scanner(System.in).nextLine());
				
			}
			if(n <= capacity) {
				for (int i = 0; i < n; i++) {
					Employee employee = new Employee();
					employee.Input();
					employeesArrayEmployee.insertion(employee);
				}
				System.out.println("The Employees in the system are:");
				employeesArrayEmployee.display();
				System.out.println();
				break;
			}
		}
		
		System.out.println(
                "Enter 1 for Search, 2 for insertion, 3 for delete, 4 for remove, 5 for Employee highest salary, 6 for average salary, 7 for exit");
        s = Integer.parseInt(new Scanner(System.in).nextLine());
        
        while(true) {
        	if(s!=1 || s!=2 || s!=3 || s!=4 || s!=5 || s!=6 || s!=7) {
        		
        		System.out.println("Enter 1 for Search, 2 for insertion, 3 for delete, 4 for remove, 5 for Employee highest salary, 6 for average salary, 7 for exit");
        		s = Integer.parseInt(new Scanner(System.in).nextLine());
        	}
			
			 while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s == 6 || s == 7) {

		            if (s == 1) {
		                System.out.println("Enter id of the employee you are looking for: ");
		                key = Integer.parseInt(new Scanner(System.in).nextLine());
		                position = employeesArrayEmployee.BinarySearch(key);
		                if (position != -1) {
		                    System.out.printf("The index of the searching item in the array is %1$s" + "\r\n", position);
		                    System.out.printf("The searching item in the array is %1$s" + "\r\n",
		                           SortedArrayEmployee.employees[position].toString());
		                }
		               break;
		            };

		            if (s == 2) {
		                if (employeesArrayEmployee.currentSize == capacity) {
		                    System.out.println("the array is full\n");
		                } else {
		                    System.out.println("Enter employee details that you want to insert");
		                    Employee employee = new Employee();
		                    employee.Input();
		                    employeesArrayEmployee.insertion(employee);
		                    System.out.println("The new employees array : ");
		                }
		                employeesArrayEmployee.display();
		                System.out.println();
		                break;
		            };
		            

		            if (s == 3) {
		                System.out.println("Enter employee id that you want to delete");
		                key = Integer.parseInt(new Scanner(System.in).nextLine());
		                employeesArrayEmployee.deletion(key);
		                System.out.println("The remaining employees are: ");
		                employeesArrayEmployee.display();
		                break;
		            }

		            if (s == 4) {
		                employeesArrayEmployee.remove();
		                System.out.println(SortedArrayEmployee.employees[n - 1].toString() + " has been removed!\n");
		                System.out.println("The employees remaining are: ");
		                employeesArrayEmployee.display();
		                break;
		            };
		            

		            if (s == 5) {
		                System.out.println("The employee that earns the highest is: ");
		                System.out.println(employeesArrayEmployee.EmployeeWithHighestSalary());
		                break;
		            };
		            

		            if (s == 6) {
		                System.out.printf("The average salary of the current employees is %.2f",
		                        employeesArrayEmployee.AverageSalary());
		                System.out.println();
		                System.out.println();
		                break;
		            };
		            
		            
		            if (s == 7) {
		            	System.out.println("GoodBye!!!");
		            	System.exit(0);
		            }

//		            System.out.println(
//		                    "Enter 1 for Search, 2 for insertion, 3 for delete, 4 for remove, 5 for highest salary, 6 is average salary, 7 for exit");
//		            s = Integer.parseInt(new Scanner(System.in).nextLine());
		        }
		       // System.out.println("Goodbye!");
        }

    }

}
