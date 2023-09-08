package unsortedArray;
import java.util.*;

public class unsortedArrayAccess
{

	public static double[] arr;
	public int arraySize;

	public unsortedArrayAccess(int scale)
	{
		arr = new double[scale];
		arraySize = 0;
	}


	public int search(double Key)
	{
		int i = 0;
		while ((i < arraySize) && (arr[i] != Key) )
		{
			i = i + 1;
		}
		if (i < arraySize)
		{
			return i;
		}
		else
		{
			System.out.println("There is no such item!");
			return -1;
		}
	}

	public void append(double Item)
	{
		arr[arraySize] = Item;
		arraySize = arraySize + 1;
	}

	public double remove()
	{
		if (arraySize == 0)
		{
			System.out.println("There is no item in the array!");
			return -1;
		}
		double x = arr[arraySize - 1];
		arraySize = arraySize - 1;
		return x;
	}

	public void deletion(double Key)
	{
		int k = search(Key);
		if (k != -1)
		{
			for (int i = k; i < arraySize-1; i++)
			{
				arr[i] = arr[i + 1];
			}
			arraySize = arraySize - 1;
		};
	}

	public void display()
	{
		if (arraySize == 0)
		{
			System.out.println("Array is empty!");
		}
		else
		{
			for (int i = 0; i < arraySize; i++)
			{
				System.out.println(arr[i]);
			}
		};

		System.out.println("array size is " + arraySize);
	}
}