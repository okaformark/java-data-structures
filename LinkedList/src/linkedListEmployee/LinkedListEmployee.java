package linkedListEmployee;


public class LinkedListEmployee {

	public Node header;

	public LinkedListEmployee()
	{
		header = null;
	}
	
	public final double Average() {
		double sum =0;
		int count = 0;
		Node currentNode = header;
		while(currentNode!= null) {
			count++;
			sum += currentNode.employee.salary;
			currentNode = currentNode.link;
		}
		return sum / count;
	}
	
	public final Employee SearchEmployeeWithHighestSalary() {
		Employee max = header.employee;
		Node currentNode = header.link;
		if(currentNode == null) {
			System.out.println("LinkedList is empty");
		}
		else {
			while(currentNode !=null) {
				if(currentNode.employee.salary > max.salary) {
					max = currentNode.employee;
					currentNode=currentNode.link;
				}
				currentNode = currentNode.link;
			}
		}
		return max;
}
	

	public final Node SearchEmployee(int id)
	{
		Node current = header;
		while (current != null && current.employee.id != id)
		{
			current = current.link;
		}
		return current;
	}

	public final void Append(Employee newEmployee)
	{
		Node newNode = new Node(newEmployee);
		newNode.link = header;
		header = newNode;
	}

	public final Node Remove()
	{
		Node x = header;
		if (header != null)
		{
			header = header.link;
		}
		return x;
	}

	public final Node searchPrevious(int key)
	{
		if (header == null)
		{
			return header;
		}
		else
		{
			Node current = header;
			while (!(current.link == null) && (current.link.employee.id != key))
			{
				current = current.link;
			}
			return current;
		}
	}

	public final void Insert(Employee newEmployee, int preKey)
	{
		Node current;
		Node newNode = new Node(newEmployee);
		current = SearchEmployee(preKey);
		if (current == null)
		{
			System.out.println("there is no such preKey!");
		}
		else
		{
			newNode.link = current.link;
			current.link = newNode;
		}
	}


	public final void Delete(int key)
	{
		if (header == null) // The list is empty!
		{
			System.out.println("The list is empty!");
		}
		else
		{
			if (header.employee.id == key) // header to be deleted.
			{
				header = header.link;
			}
			else
			{
				Node p = searchPrevious(key);
				if (p.link == null)
				{
					System.out.println("There is no such item!");
				}
				else
				{
					p.link = p.link.link;
				}
			}
		}
	}

    public final void ShowLinkedList()
    {
        if (header == null)
        	System.out.println("The list is empty!");
        else
        {
            Node current = header;
            System.out.printf("%1$s->", current.employee);
            while (!(current.link == null))
            {
                current = current.link;
                System.out.printf("%1$s->", current.employee);

            }
            System.out.printf("null");
            System.out.println();
        }
    }
	public final void PrintList()
	{
		if (header == null)
		{
			System.out.println("The list is empty!");
		}
		else
		{
			Node current = header;
			System.out.println(current.employee);
			while (!(current.link == null))
			{
				current = current.link;
				System.out.println(current.employee);
			}
		}
	}
}
