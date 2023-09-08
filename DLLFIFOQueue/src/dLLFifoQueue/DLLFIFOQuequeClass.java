package dLLFifoQueue;

public class DLLFIFOQuequeClass {
	DoubleLL doubleLL;
	
	public DLLFIFOQuequeClass() {
		// TODO Auto-generated constructor stub
		doubleLL = new DoubleLL();
	}
	public void Enqueue(int newItem) {
		doubleLL.AppendToTail(newItem);
	}
	
	public Node Dequeue() {
		return doubleLL.RemoveFromHead();
	}
	
	public void Print() {
		doubleLL.PrintList();
	}
}
