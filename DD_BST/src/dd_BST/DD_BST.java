package dd_BST;

public class DD_BST {
	BinarySearchTree DD;
	public DD_BST() {
		DD = new BinarySearchTree();
	}
	
	public Node Search(int key) {
		return DD.Search(key);
	}
	
	public void Insert(int item) {
		DD.Insert(item);
	}
	
	public boolean Delete(int key) {
		return DD.Delete(key);
	}
	
	public void Display() {
		Node rootNode = DD.getroot();
		DD.InOrder(rootNode);
	}
}
