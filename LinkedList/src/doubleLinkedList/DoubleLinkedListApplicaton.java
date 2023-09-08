package doubleLinkedList;

import java.util.Random;
import java.util.Scanner;

public class DoubleLinkedListApplicaton {
	public static void main(String args[]){
		int key, preKey;
		int newItem;

		/* create an empty linked list */
		DoubleLinkedList linkedList = new DoubleLinkedList();

		/* create a linked list of 5 nodes */
		Random rnd = new Random();

		for (int i = 0; i < 3; i++)
		{
			newItem = rnd.nextInt(101) ;
			linkedList.AppendToHead(newItem);
		}

		/* print the list */
		System.out.println("The folinkedListowing are the items/integers in the current linked list from the header:");

		linkedList.PrintList();

		System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for append, 5 for remove,6 for append to tail, 7 for remove from tail, 8 for exit");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s==6 || s == 7 || s==8)
		{
			if (s == 1)
			{
				System.out.println("Enter an key/integer that you want to search:");
				key = Integer.parseInt(new Scanner(System.in).nextLine());
				Node n = linkedList.Search(key);
				if (n != null)
				{
					System.out.printf("The item/integer is found: %1$s" + "\r\n", n.item);
				}
				else
				{
					System.out.println("there is no such key!");
				}
			};
			if (s == 2)
			{
				System.out.println("Enter a new item/integer that you want to insert:");
				newItem = Integer.parseInt(new Scanner(System.in).nextLine());
				System.out.println("Enter the preKey/integer that the new item wilinkedList folinkedListow:");
				preKey = Integer.parseInt(new Scanner(System.in).nextLine());
				linkedList.Insert(newItem, preKey);
				System.out.println("The items/integers of the current linked list from the header:");
				linkedList.PrintList();
			};
			if (s == 3)
			{
				System.out.println("Enter the key/integer of the item that you want to delete:");
				key = Integer.parseInt(new Scanner(System.in).nextLine());
				linkedList.Delete(key);
				System.out.println("The items/integers in the current linked list from the header.");
				linkedList.PrintList();
			};
			if (s == 4)
			{
				System.out.println("Enter the item/integer that you want to append:");
				newItem = Integer.parseInt(new Scanner(System.in).nextLine());
				linkedList.AppendToHead(newItem);
				System.out.println("The items/integers in the current linked list from the header");
				linkedList.PrintList();
			};
			if (s == 5)
			{
				Node RemoveNode = linkedList.RemoveFromHead();
				if (RemoveNode != null)
				{
					System.out.printf("The removed item is: %1$s" + "\r\n", RemoveNode.item);
					System.out.println("The items/integers in the current linked list from the header");
					linkedList.PrintList();
				}
				
				
				else
				{
					System.out.println("The linked list is empty!");
				}
			};
			
			if (s == 6)
			{
				System.out.println("Enter the item/integer that you want to append:");
				newItem = Integer.parseInt(new Scanner(System.in).nextLine());
				linkedList.AppendToTail(newItem);
				System.out.println("The items/integers in the current linked list from the header");
				linkedList.PrintList();
			};
			if (s == 7)
			{
				Node RemoveNode = linkedList.RemoveFromTail();
				if (RemoveNode != null)
				{
					System.out.printf("The removed item is: %1$s" + "\r\n", RemoveNode.item);
					System.out.println("The items/integers in the current linked list from the header");
					linkedList.PrintList();
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
