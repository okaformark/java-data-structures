package binarySearchTree;

import binarySearchTreeEmployee.BSTEmployee;

public class Node {
		public BSTEmployee item;
		public Node Left;
		public Node Right;

		public Node(BSTEmployee employee)
		{
			item = employee;
			Left = null;
			Right = null;
		}

		public void DisplayNode()
		{
			System.out.println(item + "");
		}

}
