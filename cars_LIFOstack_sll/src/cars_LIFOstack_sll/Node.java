package cars_LIFOstack_sll;

public class Node {
	public Cars car;
	public Node link;

	public Node(Cars newCar)
	{
		car = newCar;
		link = null;
	}
}
