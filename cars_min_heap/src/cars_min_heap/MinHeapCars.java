package cars_min_heap;

public class MinHeapCars {

	public int heapSize, capacity;
	public Cars[] car;
	
	public MinHeapCars(int cap)
	{
		heapSize = 0;
		capacity = cap;
		car = new Cars[cap];
	}

	public final void inputToArray(Cars newCar)
	{
		car[heapSize] = newCar;
		heapSize = heapSize + 1;
	}

	public void heapify(int parent)
	{
		int Lson, Rson, smallest;
		Cars temp;
		Lson = 2 * parent + 1;
		Rson = 2 * parent + 2;
		/* find the largest among A[parent], A[lson] and A[rson] */
		if ( Lson <= heapSize - 1 && car[Lson].price < car[parent].price )
		{
			smallest = Lson;
		}
		else
		{
			smallest = parent;
		}
		if (Rson <= heapSize - 1 && car[Rson].price < car[smallest].price )
		{
			smallest = Rson;
		}
		if (smallest != parent)
		{
			temp = car[parent];
			car[parent] = car[smallest];
			car[smallest] = temp;
			heapify(smallest);
		}

	}

	public void buildHeap()
	{
		for (int i = (heapSize - 1) / 2; i >= 0; i--)
		{
			heapify(i);
		}
	}


	public void displayHeap()
	{
		System.out.println("heapArray: "); // array format
		for(int m=0; m<heapSize; m++)
			if(car[m] != null)
			 System.out.print( car[m] + " ");
			else
			 System.out.print( "-- ");
		System.out.println();
		// heap format
		int nBlanks = 32;
		int itemsPerRow = 1;
		int column = 0;
		int j = 0; // current item
		String dots = "...............................";
		System.out.println(dots+dots); // dotted top line
		while(heapSize > 0) // for each heap item
		{
			if(column == 0) // first item in row?
				for(int k=0; k<nBlanks; k++) // preceding blanks
					System.out.print(' ');
			// display item
			System.out.print(car[j]);
			if(++j == heapSize) // done?
				break;
			if(++column==itemsPerRow) // end of row?
			{
				nBlanks /= 2; // half the blanks
				itemsPerRow *= 2; // twice the items
				column = 0; // start over on
				System.out.println(); // new row
			}
			else // next item on row
				for(int k=0; k<nBlanks*2-2; k++)
					System.out.print(' '); // interim blanks
		} // end for
		System.out.println("\n"+dots+dots); // dotted bottom line
	} // end displayHeap()
	
	public void printHeap()
	{
		for (int i = 0; i <= heapSize - 1; i++)
		{
			System.out.println(car[i]);
		}

	}
	

	public Cars extractMin()
	{
		if (heapSize == 0)
		{
			System.out.println("Heap is empty");
			return null;
		}
		else
		{
			Cars min = car[0];
			car[0] = car[heapSize - 1];
			heapSize = heapSize - 1;
			heapify(0);
			return min;
		}
	}

	public void heapInsert(Cars newCar)
	{
		if(heapSize == capacity){
			System.out.println("The heap is full!");
			return;
		}
		int parent;
		heapSize = heapSize + 1;
		int i = heapSize - 1;
		parent = (i - 1) / 2;
		while (i > 0 && car[parent].price > newCar.price)
		{
			car[i] = car[parent];
			i = parent;
			parent = (i - 1) / 2;
		}
		car[i] = newCar;
	}
	
	public void heapSort()
	{
	    Cars temp;
	   // buildHeap();
	     int keepSize = heapSize; 
	     for (int i = heapSize - 1; i >= 1; i--)
	     {
	           temp = car[heapSize-1];
	           car[heapSize - 1] = car[0];
	           car[0] = temp;
	            heapSize = heapSize - 1;
	            heapify(0);
	     }
	         heapSize = keepSize;
	         printHeap();
	}
}
