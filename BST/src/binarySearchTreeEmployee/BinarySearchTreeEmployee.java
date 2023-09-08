package binarySearchTreeEmployee;

import binarySearchTree.Node;

public class BinarySearchTreeEmployee {
	public EmployeeNode root;

    public BinarySearchTreeEmployee() {
        root = null;
    }

    public EmployeeNode getRoot() {
        return root;
    }

    public EmployeeNode Search(final double KEY) {
        EmployeeNode x = root;
        while (x != null && x.item.salary != KEY) {
            if (KEY < x.item.salary) {
                x = x.Left;
            } else {
                x = x.Right;
            }
        }
        return x;
    }

    public void Insert(BSTEmployee employee)
	{
		EmployeeNode parent = null;
		EmployeeNode newNode = new EmployeeNode();
		EmployeeNode current = root;
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

    public boolean Delete(final double KEY) {
        EmployeeNode current = root;
        EmployeeNode parent = root;
        boolean isLeftChild = true;

        /* Find the deleting Employee (current) */
        if (current == null) {
            return false;
        }
        while (current.item.salary != KEY) {
            parent = current;
            if (KEY < current.item.salary) {
                isLeftChild = true;
                current = current.Left;
            } else {
                isLeftChild = false;
                current = current.Right;
            }
            if (current == null) {
                return false;
            }
        }

        /* Case 1: the deleting Employee (current) has no child */
        if ((current.Left == null) && (current.Right == null)) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.Left = null;
            } else {
                parent.Right = null;
            }
        }

        /* Case 2: the deleting Employee (current) has one child */
        else if (current.Right == null) {
            if (current == root) {
                root = current.Left;
            } else if (isLeftChild) {
                parent.Left = current.Left;
            } else {
                parent.Right = current.Left;
            }
        }

        else if (current.Left == null) {
            if (current == root) {
                root = current.Right;
            } else if (isLeftChild) {
                parent.Left = current.Right;
            } else {
                parent.Right = current.Right;
            }
        }

        /* Case 3: the deleting Employee (current) has two children */
        else {
            final EmployeeNode successorParent = GetSuccessorParent(current);
            final EmployeeNode successor = successorParent.Left;
            if (!(successor == current.Right)) {
                successorParent.Left = successor.Right;
            }
            current.item = successor.item;
        }

        return true;
    }

    public EmployeeNode GetSuccessorParent(final EmployeeNode delEmployee) {
        EmployeeNode successorParent = delEmployee;
        EmployeeNode successor = delEmployee;
        EmployeeNode current = delEmployee.Right;
        while (!(current == null)) {
            successorParent = successor;
            successor = current;
            current = current.Left;
        }
        return successorParent;
    }

    public void InOrder(final EmployeeNode theRoot) {
        if (!(theRoot == null)) {
            InOrder(theRoot.Left);
            theRoot.DisplayEmployee();
            InOrder(theRoot.Right);
        }
    }

    public void InOrder() {
        InOrder(root);
    }

    public int Height(final EmployeeNode n) {
        if (n == null) {
            return -1;
        }

        final int left = Height(n.Left);
        final int right = Height(n.Right);

        if (right > left) {
            return right + 1;
        } else {
            return left + 1;
        }
    }

    public EmployeeNode Smallest() {
        EmployeeNode min = root;
        if (root == null) {
            return root;
        }

        while (min.Left != null) {
            min = min.Left;
        }
        return min;
    }

    public double Total(EmployeeNode n) {

        if (root == null) {
            System.out.println("Empty Binary Tree");
        }
        double tot = 0.0;

        while (n != null) {
            tot += n.item.salary;
            tot += Total(n.Left);
            tot += Total(n.Right);
            return tot;
        }
        return tot;
    }

    public int numEmployee(EmployeeNode n) {
        int count = 0;
        if (n != null) {
            count += 1;
            count += numEmployee(n.Left);
            count += numEmployee(n.Right);
            return count;
        }
        return 0;
    }

}
