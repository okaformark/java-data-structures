package sortedArray;

import java.util.*;

public class SortedArrayAccess
{
	public double[] arr;
	public int currentSize;

	public SortedArrayAccess(int scale)
	{
		arr = new double[scale];
		currentSize = 0;
	}

	public final int BinarySearch(double Key)
	{
		int k = 0;
		int lower = 0;
		int upper = currentSize - 1;
		while (lower < upper)
		{
			k = (lower + upper + 1) / 2;
			if (Key == arr[k])
			{
				break;
			}
			if (Key < arr[k])
			{
				upper = k - 1;
			}
			else
			{
				lower = k + 1;
			}
		}
		if (lower == upper)
		{
			k = lower;
		}
		if (Key == arr[k])
		{
			return k;
		}
		else
		{
			System.out.println("The item cannot be found!");
			return -1;
		}
	}


	public final void insertion(double Item)
	{
		if (currentSize == 0)
		{
			arr[0] = Item;
		}
		/* find the position for inserting the given item */
		int position = 0;
		while (position < currentSize && Item > arr[position] )
		{
			position++;
		}
		for (int i = currentSize; i > position; i--)
		{
			arr[i] = arr[i - 1];
		}
		arr[position] = Item;
		currentSize = currentSize + 1;

	}

	public final void deletion(double Key)
	{
		/* find the given item */
		int position = BinarySearch(Key);
		if (position != -1)
		{
			for (int i = position; i < currentSize - 1; i++)
			{
				arr[i] = arr[i + 1];
			}
			currentSize = currentSize - 1;
		};
	}

	public final double remove()
	{	
		double x = arr[currentSize-1];
		currentSize--;
		return x;
				
	}
	public final void display()
	{
		if (currentSize != 0)
		{
			for (int i = 0; i < currentSize; i++)
			{
				System.out.println(arr[i]);
			}
		};

		System.out.println("The number of items is " + currentSize);
	}
}
