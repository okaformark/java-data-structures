package binarySearchTreeEmployee;

public class EmployeeNode {
	public BSTEmployee item;
    public EmployeeNode Left;
    public EmployeeNode Right;

    public EmployeeNode() {
        item = new BSTEmployee();
        item.Input();
        Left = null;
        Right = null;
    }

    public void DisplayEmployee() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("[Node, Containing Item: %s]", item);
    }


}
