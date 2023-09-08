package cars_bst;

public class BSTCars {
	public Node root;

	public BSTCars()
	{
		root = null;
	}

	public Node getroot()
	{
		return root;
	}

	public Node Search(int KEY)
	{
		Node carToSearch = root;
		while (carToSearch != null && carToSearch.car.ID != KEY)
		{
			if (KEY < carToSearch.car.ID)
			{
				carToSearch = carToSearch.leftNode;
			}
			else
			{
				carToSearch = carToSearch.rightNode;
			}
		}
		return carToSearch; // x.item == key or x == null
	}

	public void Insert(Cars newCar)
	{
		Node parent = null;
		Node newCarNode = new Node(newCar);
		Node current = root;
		while (current != null)
		{
			parent = current;
			if (newCarNode.car.ID < current.car.ID)
			{
				current = current.leftNode;
			}
			else
			{
				current = current.rightNode;
			}
		}
		if (root == null)
		{
			root = newCarNode;
		}
		else
		{
			if (newCarNode.car.ID < parent.car.ID)
			{
				parent.leftNode = newCarNode;
			}
			else
			{
				parent.rightNode = newCarNode;
			}
		}
	}

	public boolean Delete(int KEY)
	{
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		/* Find the deleting node (current) */
		if (current == null)
		{
			return false;
		}
		while (current.car.ID != KEY)
		{
			parent = current;
			if (KEY < current.car.ID)
			{
				isLeftChild = true;
				current = current.leftNode;
			}
			else
			{
				isLeftChild = false;
				current = current.rightNode;
			}
			if (current == null)
			{
				return false;
			}
		}

		/* Case 1: the deleting node (current) has no child */
		if ((current.leftNode == null) && (current.rightNode == null))
		{
			if (current == root)
			{
				root = null;
			}
			else if (isLeftChild)
			{
				parent.leftNode = null;
			}
			else
			{
				parent.rightNode = null;
			}
		}

		/* Case 2: the deleting node (current) has one child */
		else if (current.rightNode == null)
		{
			if (current == root)
			{
				root = current.leftNode;
			}
			else if (isLeftChild)
			{
				parent.leftNode = current.leftNode;
			}
			else
			{
				parent.rightNode = current.leftNode;
			}
		}
		else if (current.leftNode == null)
		{
			if (current == root)
			{
				root = current.rightNode;
			}
			else if (isLeftChild)
			{
				parent.leftNode = current.rightNode;
			}
			else
			{
				parent.rightNode = current.leftNode;
			}
		}

		/* Case 3: the deleting node (current) has two children */
		else
		{
			Node successorParent = GetSuccessorParent(current);
			Node successor = successorParent.leftNode;
			if (!(successor == current.rightNode))
			{
				successorParent.leftNode = successor.rightNode;
			}
			current.car = successor.car;
		}

		return true;
	}

	public Node GetSuccessorParent(Node delNode)
	{
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightNode;
		while (!(current == null))
		{
			successorParent = successor;
			successor = current;
			current = current.leftNode;
		}
		return successorParent;
	}

	public void InOrder(Node theRoot)
	{
		if (!(theRoot == null))
		{
			InOrder(theRoot.leftNode);
			theRoot.DisplayNode();
			InOrder(theRoot.rightNode);
		}
	}
}
