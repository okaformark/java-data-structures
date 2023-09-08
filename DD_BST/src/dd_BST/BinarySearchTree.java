package dd_BST;

public class BinarySearchTree {
	public Node root;

	public BinarySearchTree()
	{
		root = null;
	}

	public Node getroot()
	{
		return root;
	}

	public Node Search(int KEY)
	{
		Node x = root;
		while (x != null && x.item != KEY)
		{
			if (KEY < x.item)
			{
				x = x.Left;
			}
			else
			{
				x = x.Right;
			}
		}
		return x; // x.item == key or x == null
	}

	public  void Insert(int newItem)
	{
		Node parent = null;
		Node newNode = new Node(newItem);
		Node current = root;
		while (current != null)
		{
			parent = current;
			if (newNode.item < current.item)
			{
				current = current.Left;
			}
			else
			{
				current = current.Right;
			}
		}
		if (root == null)
		{
			root = newNode;
		}
		else
		{
			if (newNode.item < parent.item)
			{
				parent.Left = newNode;
			}
			else
			{
				parent.Right = newNode;
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
		while (current.item != KEY)
		{
			parent = current;
			if (KEY < current.item)
			{
				isLeftChild = true;
				current = current.Left;
			}
			else
			{
				isLeftChild = false;
				current = current.Right;
			}
			if (current == null)
			{
				return false;
			}
		}

		/* Case 1: the deleting node (current) has no child */
		if ((current.Left == null) && (current.Right == null))
		{
			if (current == root)
			{
				root = null;
			}
			else if (isLeftChild)
			{
				parent.Left = null;
			}
			else
			{
				parent.Right = null;
			}
		}

		/* Case 2: the deleting node (current) has one child */
		else if (current.Right == null)
		{
			if (current == root)
			{
				root = current.Left;
			}
			else if (isLeftChild)
			{
				parent.Left = current.Left;
			}
			else
			{
				parent.Right = current.Left;
			}
		}
		else if (current.Left == null)
		{
			if (current == root)
			{
				root = current.Right;
			}
			else if (isLeftChild)
			{
				parent.Left = current.Right;
			}
			else
			{
				parent.Right = current.Right;
			}
		}

		/* Case 3: the deleting node (current) has two children */
		else
		{
			Node successorParent = GetSuccessorParent(current);
			Node successor = successorParent.Left;
			if (!(successor == current.Right))
			{
				successorParent.Left = successor.Right;
			}
			current.item = successor.item;
		}

		return true;
	}

	public Node GetSuccessorParent(Node delNode)
	{
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.Right;
		while (!(current == null))
		{
			successorParent = successor;
			successor = current;
			current = current.Left;
		}
		return successorParent;
	}

	public void InOrder(Node theRoot)
	{
		if (!(theRoot == null))
		{
			InOrder(theRoot.Left);
			theRoot.DisplayNode();
			InOrder(theRoot.Right);
		}
	}
}
