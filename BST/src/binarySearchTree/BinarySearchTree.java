package binarySearchTree;

import binarySearchTreeEmployee.BSTEmployee;

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
		while (x != null && x.item.id != KEY)
		{
			if (KEY < x.item.id)
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

	public void Insert(BSTEmployee newItem)
	{
		Node parent = null;
		Node newNode = new Node(newItem);
		Node current = root;
		while (current != null)
		{
			parent = current;
			if (newNode.item.id < current.item.id)
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
			if (newNode.item.id < parent.item.id)
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
		while (current.item.id != KEY)
		{
			parent = current;
			if (KEY < current.item.id)
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
	public int Height(Node n) {
        if (n == null) {
            return -1;
        }

        int leftNode = Height(n.Left);
        int rightNode = Height(n.Right);

        if (rightNode > leftNode) {
            return rightNode + 1;
        } else {
            return leftNode + 1;
        }
    }
	
    public int SmallestNode(Node n) {
        if (n == null) {
            return -1;
        }

        if (n.Left == null) {
            return n.item.id;
        } else {
            return SmallestNode(n.Left);
        }
    }

    public int Average(Node n) {
        int total = 0;
        if (n != null) {
            total += n.item.id;
            total += Average(n.Left);
            total += Average(n.Right);
            return total;
        }
        return 0;
    }

    public int numNode(Node n) {
        int count = 0;
        if (n != null) {
            count += 1;
            count += numNode(n.Left);
            count += numNode(n.Right);
            return count;
        }
        return 0;

    }


}
