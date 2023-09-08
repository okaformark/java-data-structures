package linkedListEmployee;


public class Node
{
	public Employee employee;
	public Node link;

	public Node(Employee theEmployee)
	{
		employee = theEmployee;
		link = null;
	}
}


