package dLLFifoQueue;

import java.util.Random;
import java.util.Scanner;


public class DLLFifoQueueApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag;
		int key;
		int newItem;
		
		DLLFIFOQuequeClass dll = new DLLFIFOQuequeClass();
		Random random = new Random();
		for(int i = 0; i< 5; i++) {
			newItem = random.nextInt(101);
			dll.Enqueue(newItem);
		}
		System.out.println("The items in the queue are: ");
		dll.Print();
		
		
		System.out.println("press 1 to Enqueue, 2 to Dequeue, press 3 to Exit ");
		flag = Integer.parseInt(new Scanner(System.in).nextLine());
		
		while(flag ==1 || flag ==2) {
			
			if(flag ==1) {
				
				System.out.println("Enter a value you want to enqueue");
				key = Integer.parseInt(new Scanner(System.in).nextLine());
				dll.Enqueue(key);
				System.out.println("value Enqueued");
				System.out.println("The new Queue is: ");
				dll.Print();
			}
			else {
				
				if (flag ==2) {
					Node xNode =dll.Dequeue();
					System.out.println(xNode.item + " " + "dequeued from the queue");
					System.out.println("The current queue is: ");
					dll.Print();
				}
			}
			System.out.println("press 1 to Enqueue, 2 to Dequeue, press 3 to Exit ");
			flag = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		System.out.println("GoodBye! ");
	}

}
