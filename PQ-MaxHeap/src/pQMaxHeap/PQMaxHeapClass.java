package pQMaxHeap;

public class PQMaxHeapClass {
	MaxHeap pQHeap;
	
	public PQMaxHeapClass(int cap) {
		pQHeap = new MaxHeap(cap);
	}
	
	public int ExtractHighestPriority() {
		return pQHeap.extractMax();
	}
	
	public void Insert(int item) {
		pQHeap.heapInsert(item);
	}
	
	public void Display() {
		pQHeap.printHeap();
	}
	
	public void AddToArray(int item) {
		pQHeap.inputToArray(item);
	}
	
	public void SortHeap() {
		pQHeap.heapSort();
	}
	
	public void BuildHeap() {
		pQHeap.buildHeap();
	}
}
