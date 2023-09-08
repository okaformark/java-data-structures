package hashTable;
import java.util.*;




public class HashTableClass {
	public int tableSize; 
	Node[] T;
    public HashTableClass()
    { 
    	System.out.println("Give the hash table size");
        tableSize = Integer.parseInt(new Scanner(System.in).nextLine());
        T = new Node[tableSize];
        for (int i = 0; i < tableSize; i++)
            T[i] = null;
    }

    public int hashFunction(int Key)
    { 
        return Key % tableSize; 
    }
    public Node Search(int Key)
    {
      int h = hashFunction(Key);
      Node current = T[h];
      while (current != null && current.item.salary != Key)
         current = current.link;
      return current;
    }
    public void Insert(Employee newItem)
    {
        int h = hashFunction(newItem.salary);
        Node current = T[h];
        Node newNode = new Node(newItem);
        newNode.link = T[h];
        T[h] = newNode;
    }
    public void Delete(int Key)
    { 
    	int h = hashFunction(Key);
    	if (T[h] == null) // The list is empty!
    		System.out.println("There is no such item!");
    	else
    	{  
    		if (T[h].item.salary == Key) // The only node in the list is to be deleted.
    			T[h] = T[h].link;
    		else // The list has more than one node.
            { 
    			Node p = searchPrevious(Key);
    			if (p.link == null)
                     System.out.println("There is no such item!");
    			else 
    				p.link = p.link.link;
             } 
    	}
    }
    public Node searchPrevious(int key)
	{
    	int h = hashFunction(key);
		if (T[h] == null)
		{
			return T[h];
		}
		else
		{
			Node current = T[h];
			while (!(current.link == null) && (current.link.item.salary != key))
			{
				current = current.link;
			}
			return current;
		}
	}
    public void PrintHashTable()
    {
        for (int i = 0; i <= tableSize - 1; i++)
        { 
        	if (T[i] == null)
        		System.out.println("T(" + i + "): " + "no item" + "\n");
             else
             { 
            	 Node current = T[i];
            	 System.out.print("T(" + i + "): " + current.item.salary + ", " + current.item.name + ".");
                 while (!(current.link == null))
                 { 
                	 current = current.link;
                     System.out.print(+current.item.salary + ", ");
                 }
             System.out.println("\n");}
           	}
    	} 

    public final Employee SearchNodeWithLargestKey() {
    	Employee withMaxSalary = T[0].item;
		withMaxSalary.salary = T[0].item.salary;
		for (int i = 1; i < tableSize; i++) {
			if(withMaxSalary.salary < T[i].item.salary) {
				withMaxSalary = T[i].item;
			}
		}
		return withMaxSalary;
}
    public final double Average() {
    	double aveSalary = 0;
		for (int i = 0; i < tableSize; i++) {
			aveSalary += T[i].item.salary;
		}
		return aveSalary/T.length ;
	}
}
