package cars_dll;

public class DoubleLL {
	public Node headerNode;
	public Node tailNode;
	
	public DoubleLL() {
		headerNode = null;
		tailNode = null;
	}

	public void AppendToHead(Cars newCar)
	{
		Node newCarNode = new Node(newCar);
		if (headerNode == null)
		{
			headerNode = newCarNode;
			tailNode = newCarNode;
		}
		else
		{
			newCarNode.flinkNode = headerNode;
			headerNode.bLinkNode = newCarNode;
			headerNode = newCarNode;
		}
	}

	public void AppendToTail(Cars newCar)
	{
		Node newCarNode = new Node(newCar);
		if (tailNode == null)
		{
			tailNode = newCarNode;
			headerNode = newCarNode;
		}
		else
		{
			newCarNode.bLinkNode= tailNode;
			tailNode.flinkNode = newCarNode;
			tailNode = newCarNode;
		}
	}

	public Node RemoveFromHead()
	{
		Node nodeToRemove = headerNode;
		if (headerNode != null)
		{
			if (headerNode == tailNode)
			{
				headerNode = null;
				tailNode = null;
			}
			else
			{
				headerNode = headerNode.flinkNode;
				headerNode.bLinkNode = null;
			}
		}
		else
		{
			System.out.println("the list is empty");
		}
		return nodeToRemove;
	}

	
	public Node RemoveFromTail()
	{
		Node nodeToRemove = tailNode;
		if (tailNode!= null)
		{
			if (headerNode == tailNode)
			{
				headerNode = null;
				tailNode = null;
			}
			else
			{
				tailNode.bLinkNode.flinkNode = null;
				tailNode = tailNode.bLinkNode;
			}
		}
		else
		{
			System.out.println("the list is empty");
		}
		return nodeToRemove;
	}

	public Node Search(int key)
	{
		Node current;
		current = headerNode;
		while (current != null && current.car.ID != key)
		{
			current = current.flinkNode;
			if(current == null) {
				System.out.println("There is no such car");
			}
		}
		return current;
	}

	public void Insert(Cars newCar, int preKey)
	{
		Node newCarNode = new Node(newCar);
		Node current = Search(preKey);
		if (current == null)
		{
			System.out.println("there is no such preKey!");
		}
		if (current != null)
		{
			if (current == tailNode)
			{
				newCarNode.bLinkNode = current;
				current.flinkNode = newCarNode;
			}
			else
			{
				newCarNode.flinkNode = current.flinkNode;
				newCarNode.bLinkNode = current;
				current.flinkNode.bLinkNode = newCarNode;
				current.flinkNode = newCarNode;
				if (newCarNode.flinkNode == null)
				{
					tailNode = newCarNode;
				}
			}
		}
	}

	public void Delete(int key)
	{
		Node nodeToDelete = Search(key);
		if(headerNode.car.ID == key) {
			headerNode.flinkNode.bLinkNode =null;
			headerNode = headerNode.flinkNode;
		}
		else {
			if(nodeToDelete == null) {
				System.out.println("There is no such car");
			}
			if(nodeToDelete.flinkNode != null) {
				nodeToDelete.bLinkNode.flinkNode = nodeToDelete.flinkNode;
				nodeToDelete.flinkNode.bLinkNode = nodeToDelete.bLinkNode;
			}
			else {
				nodeToDelete.bLinkNode.flinkNode = null;
				tailNode = nodeToDelete.bLinkNode;
			}
		}
	}
	
	 public void PrintList()
     {
         Node current = headerNode;
         if (current == null)
         {
        	 System.out.println("The list is empty!");
             return;
         }
         System.out.printf("(header)%1$s <==> ", current.car);
 
         while (!(current.flinkNode == null))
         {
             current = current.flinkNode;
             if (current.flinkNode == null)
            	 System.out.printf("%1$s(tail)", current.car);
             else
            	 System.out.printf("%1$s <==> ", current.car);
         }
         System.out.println("\n");
//		 	if (headerNode == null)
//			{
//				System.out.println("The list is empty!");
//			}
//			else
//			{
//				Node current = headerNode;
//				System.out.println(current.car);
//				while (!(current.flinkNode == null))
//				{
//					current = current.flinkNode;
//					System.out.println(current.car);
//				}
//			}

     }
}
