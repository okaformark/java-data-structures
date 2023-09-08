package doubleLinkedList;

//Node class for doubleLinkedList

import java.util.*;

public class Node
{
	public int item;
	public Node Flink;
	public Node Blink;

	public Node(int theItem)
	{
		item = theItem;
		Flink = null;
		Blink = null;
	}
}

