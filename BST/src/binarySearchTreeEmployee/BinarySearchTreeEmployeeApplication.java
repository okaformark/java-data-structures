package binarySearchTreeEmployee;
import java.util.*;
public class BinarySearchTreeEmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Key;
        EmployeeNode foundNode;

        /* create an empty binary tree */
        BinarySearchTreeEmployee BT = new BinarySearchTreeEmployee();
        
        System.out.println("How many employee node do you want to create");
        int ans = Integer.parseInt(new Scanner(System.in).nextLine());
        
        for( int i = 0; i < ans; i++) {
        	BSTEmployee employee = new BSTEmployee();
        	employee.Input();
        	BT.Insert(employee);
        }

        /* Display all items of the binary search tree in in-order */
        System.out.println("The data of the current binary search tree in in-order.");
        BT.InOrder(BT.root);

        System.out.println(
                "Enter 1 for search, 2 for insertion, 3 for deletion, 4 for in-order display, 5 for tree height, 6 for smallest key, 7 for average of keys");
        // System.out.println("Root's data is " + BT.getRoot().item);
        int s = Integer.parseInt(new Scanner(System.in).nextLine());
        while (s <= 7) {
            if (s == 1) {
                System.out.println("Enter the salary of the employee you want to find: ");
                Key = Double.parseDouble(new Scanner(System.in).nextLine());
                foundNode = BT.Search(Key);
                if (foundNode == null) {
                    System.out.println("There is no such employee.");
                } else {
                    System.out.println("The employee is found: ");
                    System.out.println(foundNode.item);
                }
            }
            if (s == 2) {
//                System.out.println("Enter an employee that you want to insert: ");
                BSTEmployee employee = new BSTEmployee();
            	employee.Input();
            	BT.Insert(employee);
                System.out.println("The current employees in the binary search tree in-order are: ");
                BT.InOrder();
            }
            if (s == 3) {
                System.out.println("Enter the salary of the employee that you want to delete: ");
                Key = Double.parseDouble(new Scanner(System.in).nextLine());
                if (!(BT.Delete(Key) == true)) {
                    System.out.println("There is no such employee.");
                } else {
                    System.out.println("The employee is deleted");
                    System.out.println("The data of the current binary search tree in in-order.");
                    BT.InOrder(BT.root);
                }
            }
            if (s == 4) {
                BT.InOrder(BT.root);
            }
            if (s == 5) {
                System.out.println("Height of tree is: " + BT.Height(BT.root));
            }
            if (s == 6) {
                System.out.println("The employee with the smallest salary is: " + BT.Smallest());
            }
            if (s == 7) {
                System.out.println("Number of employees is: " + BT.numEmployee(BT.root));
                System.out.printf("Average salary of employees is: %.2f$",
                        (BT.Total(BT.root) / BT.numEmployee(BT.root)));
                System.out.println();
            }
            System.out.println(
                    "Enter 1 for search, 2 for insertion, 3 for deletion, 4 for in-order display, 5 for tree height, 6 for smallest key, 7 for average of keys");
            s = Integer.parseInt(new Scanner(System.in).nextLine());
        }
        System.out.println("Goodbye!");
    }

	}

