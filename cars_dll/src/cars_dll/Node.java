package cars_dll;

public class Node
{
	public Cars car;
	public Node flinkNode;
	public Node bLinkNode;

	public Node(Cars newCar)
	{
		car = newCar;
		flinkNode = null;
		bLinkNode = null;
	}
}


