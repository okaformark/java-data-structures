package binarySearchTree;

import java.util.Scanner;

public class BinarySearchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Key;
		int item;
		Node foundNode;

		/* create an empty binary tree */
		BinarySearchTree BT = new BinarySearchTree();

		int [] arr = {11, 22, 15, 44, 6, 9, 3, 33, 17, 5};
		for(int i: arr) {
			System.out.println(i);
			BT.Insert(i);
		}
		
		System.out.println("The data in the binary tree inorder are as follows: ");
		BT.InOrder(BT.root);
		
		System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for in-order display, 5 for height of the BST, 6 for the smallest node, 7 for average value in the nodes");
		System.out.println("Root's data is " + BT.getroot().item);
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s == 6 || s == 7)
		{
			if (s == 1)
			{
				System.out.println("Enter an key of the node that you want to search:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				foundNode = BT.Search(Key);
				if (foundNode == null)
				{
					System.out.println("There is nos such item.");
				}
				else
				{
					System.out.println("The item is found:");
					System.out.println(foundNode.item);
				}
			};
			if (s == 2)
			{
				System.out.println("Enter an item (it is an integer) that you want to insert:");
				item = Integer.parseInt(new Scanner(System.in).nextLine());
				BT.Insert(item);
				System.out.println("The data of the current binary search tree in in-order.");
				BT.InOrder(BT.root);
			};
			if (s == 3)
			{
				System.out.println("Enter the key of the node that you want to delete:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				if (!(BT.Delete(Key) == true))
				{
					System.out.println("There is no such item.");
				}
				else
				{
					System.out.println("The item is deleted");
					System.out.println("The data of the current binary search tree in in-order.");
					BT.InOrder(BT.root);
				}
			};
			if (s == 4)
			{
				BT.InOrder(BT.root);
			};
			
			if(s == 5) {
				System.out.println("The height of the BST is: " + BT.Height(BT.root));
			};
			if(s == 6) {
				System.out.println("The node with the smallest key is: " + BT.SmallestNode(BT.root));
			};
			if( s == 7) {
				float ave = BT.Average(BT.root) / BT.numNode(BT.root);
				System.out.println("The average of the key values of the node is: " + ave );
			};
			System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for in-order display, 5 for height of the BST, 6 for the smallest node, 7 for average value in the nodes");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
			
		}
		System.out.println("Goodbye!");
	}

}
