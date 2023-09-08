package linkedListEmployee;

import java.util.Scanner;

public class Employee
{
	
	public int id;
	public String name;
	public double salary;

    public void Input()
    {
    	System.out.println("Enter name: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Enter ID: ");
        id = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Enter Salary: ");
        salary = Double.parseDouble(new Scanner(System.in).nextLine());
    }
    public void Output()
    {
    	System.out.printf("Name: %1$s, ID: %2$s, Grade: %3$s ", name, id, salary);

    }
    public String toString() 
    {
        return String.format("Name: %1$s, ID: %2$s, Salary: %3$s ", name, id, salary);
    }
}