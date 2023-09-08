package hashTable;
import java.util.*;

public class Employee {
	public String name;
	public int salary;
	
	public Employee() {
        System.out.println("Enter name: ");         
        name = new Scanner(System.in).nextLine();         
        System.out.println("Enter Salary: ");
        salary = Integer.parseInt(new Scanner(System.in).nextLine());
    }
    public void Output()
    {
        System.out.printf("Name: %1$s, ID: %2$s, Grade: %3$s ", name, salary);                  
    }
    public String toString()
    {
        return String.format("[Name: %1$s, ID: %2$s, Grade: %3$s]", name, salary);    
    }

}
