package cars_LIFOstack_sll;


public class LinkedList {
	public Node header;

	public LinkedList()
	{
		header = null;
	}
	
	public void Append(Cars newCar)
	{
		Node newCarNode = new Node(newCar);
		newCarNode.link = header;
		header = newCarNode;
	}

	public Node Remove()
	{
		Node carToRemove = header;
		if (header != null)
		{
			header = header.link;
		}
		return carToRemove;
	}
	public void PrintList()
	{
//		if (header == null)
//		{
//			System.out.println("The list is empty!");
//		}
//		else
//		{
//			Node current = header;
//			System.out.println(current.car);
//			while (!(current.link == null))
//			{
//				current = current.link;
//				System.out.println(current.car);
//			}
//		}
		
		 if (header == null)
	        	System.out.println("The list is empty!");
	        else
	        {
	            Node current = header;
	            System.out.printf("%1$s->", current.car);
	            while (!(current.link == null))
	            {
	                current = current.link;
	                System.out.printf("%1$s->", current.car);

	            }
	            System.out.printf("null");
	            System.out.println();
	        }
	}
}
