package llStack;
import java.util.*;

import com.sun.source.tree.WhileLoopTree;

public class LLStack {
		LinkedList ll;
		
		public LLStack() {
			ll = new LinkedList();
		}

		public void Push(char c) {
			ll.Append(c);
		}
		
		public Node Pop() {
			return ll.Remove();
		}
		
		public void Print() {
			ll.PrintList();
		}
		
		
		public Boolean checkIfPalindrome(String stringInput) {
			char[] c = stringInput.toCharArray();
			for(char i : c) {	
				Push(i);
			}
			Print();
			String reverseString = "";
			Node popped;
			while(!ll.isEmpty()) {
				 popped= Pop();
				reverseString += popped.item;
			}
			
			if(stringInput.equals(reverseString)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public static void main(String args[]) {
			int flag;
			String word;
			LLStack llStack = new LLStack();
			
			System.out.println("Shall we play a game???");
			System.out.println();
			
			System.out.println("press 1 to continue, 0 to exit ");
			flag = Integer.parseInt(new Scanner(System.in).nextLine());
			
			while(flag !=0) {
				
				if(flag ==1) {
					
					System.out.println("Enter a word and i will tell you if it is a palindrome or not: ");
					word = new Scanner(System.in).nextLine();
					
					Boolean ans = llStack.checkIfPalindrome(word);
					if(ans) {
						System.out.println(ans+"! "+ "This word is a palindrome");
					}
					else {
						System.out.println(ans+"! "+ "This word is not a palindrome");
					}
				}
				System.out.println("press 1 to continue, 0 to exit ");
				flag = Integer.parseInt(new Scanner(System.in).nextLine());
			}
			System.out.println("Thanks for playing with me.GoodBye! ");
		}
	}

