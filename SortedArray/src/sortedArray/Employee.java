package sortedArray;
import java.util.*;

public class Employee {
	
	public int id;
	public String name;
	public double salary;

    public void Input()
    {
    	System.out.println("Enter name: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Enter ID: ");
        this.id = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Enter Salary: ");
        this.salary = Double.parseDouble(new Scanner(System.in).nextLine());
    }
    public void Output()
    {
    	System.out.printf("Name: %1$s, ID: %2$s, Salary: %3$s ", name, id, salary);

    }
    public String toString() 
    {
        return String.format("Name: %1$s, ID: %2$s, Salary: %3$s ", name, id, salary);
    }

}
