package dd_BST;
import java.util.Random;
import java.util.Scanner;


public class DD_BST_APPLICATION {
	public static void main(String[] args) {
		int flag, key;
		Node foundNode;
		DD_BST dd_BST = new DD_BST();
		//BinarySearchTree bst = new BinarySearchTree();
		
		Random r = new Random();
		for(int i =0; i<6;i++) {
			dd_BST.Insert(r.nextInt(101));
		}
		
		System.out.println("The new Dynamic Dictionary in-order is ");
		dd_BST.Display();
		
		System.out.println("Choose from below");
		System.out.println();
		System.out.println("1 for Search, 2 for Insertion, 3 for Deletion, 4 to Display in-order, 5 to Exit");
		flag = Integer.parseInt(new Scanner(System.in).nextLine());
		
		while(flag ==1 || flag ==2 || flag ==3 || flag==4) {
			
			if(flag ==1) {
				System.out.println("Enter the node that you want to search:");
				key = Integer.parseInt(new Scanner(System.in).nextLine());
				foundNode = dd_BST.Search(key);
				
				if (foundNode == null)
				{
					System.out.println("There is no such item.");
				}
				else
				{
					System.out.println("The item is found:");
					System.out.println(foundNode.item);
				}
			};
			
			if (flag == 2)
			{
				
				System.out.println("Enter an item (it is an integer) that you want to insert:");
				key = Integer.parseInt(new Scanner(System.in).nextLine());
				dd_BST.Insert(key);
				System.out.println("The data of the current binary search tree in in-order.");
				dd_BST.Display();
			};
			if (flag == 3)
			{
				System.out.println("Enter the node that you want to delete:");
				key = Integer.parseInt(new Scanner(System.in).nextLine());
				if (!(dd_BST.Delete(key) == true))
				{
					System.out.println("There is no such item.");
				}
				else
				{
					System.out.println("The item is deleted");
					System.out.println("The data of the current binary search tree in in-order.");
					dd_BST.Display();
				}
			};
			if (flag == 4)
			{
				dd_BST.Display();
			};
			System.out.println("1 for Search, 2 for Insertion, 3 for Deletion, 4 to Display in-order, 5 to Exit");
			flag = Integer.parseInt(new Scanner(System.in).nextLine());
		}
			System.out.println("Goodbye!");
		}
		
}
