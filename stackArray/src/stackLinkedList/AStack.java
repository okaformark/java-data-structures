package stackLinkedList;

import java.util.*;

public class LLStack
{
	private int[] arr;
	private int top;
	private int size;

	public AStack(int Size)
	{
		arr = new int[Size];
		size = Size;
		top = -1;
	}


	public boolean Empty()
	{		
		return top == -1;
	}

	public boolean Full()
	{		
		return top == size - 1;
	}

	public void Push(int x)
	{
		if (Full() == false)
		{
			top = top + 1;
			arr[top] = x;
		}
		else
		{
			System.out.println("The stack is full!");
		}
	}

	public int Pop()
	{
		if (Empty() == false)
		{
			int x = arr[top];
			top = top - 1;
			return x;
		}
		else
		{
			System.out.println("The stack is empty!");
			return -1;
		}
	}

	public void Print()
	{
		if (top == -1)
		{
			System.out.println("The stack is empty!");
		}
		else
		{
			for (int i = top; i >=0; i--)
			{
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String args[])
	{
		int num, flag, p;
		AStack arrStack = new AStack(10);
		Random rnd = new Random(100);
		for (int i = 0; i <= 4; i++)
		{
			num = rnd.nextInt(101);
			arrStack.Push(num);
		}

		arrStack.Print();

		System.out.println("Enter 1 to pop, 2 to push, 3 to exit");
		flag = Integer.parseInt(new Scanner(System.in).nextLine());
		while (flag != 3)
		{
			if (flag == 1)
			{
				p = arrStack.Pop();
				System.out.printf("the item poped out is: %1$s" + "\r\n", p);
				System.out.println("The items in the Stack  after poping are:");
				arrStack.Print();
			}
			else
			{
				if (flag == 2)
				{
					System.out.println("Enter an integer to push it into the Stack:");
					p = Integer.parseInt(new Scanner(System.in).nextLine());
					arrStack.Push(p);
					System.out.println("The items in the Stack  after pushing are:");
					arrStack.Print();

				}
			}
			System.out.println("Enter 1 to pop, 2 to push, 3 to exit");
			flag = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		System.out.println("End of testing. Goodbye!");
	}
}
