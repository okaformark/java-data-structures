package dLLFifoQueue;

public class DoubleLL {
	public Node header;
	public Node tail;

	public DoubleLL()
	{
		header = null;
		tail = null;
	}


	public Node RemoveFromHead()
	{
		Node x = header;
		if (header != null)
		{
			if (header == tail)
			{
				header = null;
				tail = null;
			}
			else
			{
				header = header.fLinkNode;
				header.bLinkNode = null;
			}
		}
		else
		{
			System.out.println("the Queue is empty");
		}
		return x;
	}

	public void AppendToTail(int newItem)
	{
		Node newNode = new Node(newItem);
		if (tail == null)
		{
			tail = newNode;
			header = newNode;
		}
		else
		{
			newNode.bLinkNode = tail;
			tail.fLinkNode = newNode;
			tail = newNode;
		}
	}

	 public void PrintList()
     {
         Node current = header;
         if (current == null)
         {
        	 System.out.println("The Queue is empty!");
             return;
         }
         System.out.printf("(header)%1$s <==> ", current.item);
         while (!(current.fLinkNode == null))
         {
             current = current.fLinkNode;
             if (current.fLinkNode == null)
            	 System.out.printf("%1$s(tail)", current.item);
             else
            	 System.out.printf("%1$s <==> ", current.item);
         }
         System.out.println("\n");
     }
}
