package cars_bst;

public class Node {
	Cars car;
	Node leftNode;
	Node rightNode;
	
	public Node(Cars newCar)
	{
		car = newCar;
		leftNode = null;
		rightNode = null;
	}

	public void DisplayNode()
	{
		System.out.println(car + "");
	}
}
