package hashTable;

public class Node
{
    public Employee item;
    public Node link;

    public Node (Employee theItem)
    {
        item = theItem;
        link = null;
    }
}

