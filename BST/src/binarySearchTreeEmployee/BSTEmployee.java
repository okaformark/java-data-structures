package binarySearchTreeEmployee;
import java.util.*;

public class BSTEmployee {
	public int id;
    public String name;
    public double salary;
    private Scanner input = new Scanner(System.in);

    public void Input() {
        System.out.println("Enter name of employee: ");
        name = input.nextLine();
        System.out.println("Enter the employee's ID: ");
        id = Integer.parseInt(input.nextLine());
        System.out.println("Enter the salary of the employee: ");
        salary = Double.parseDouble(input.nextLine());
    }

    public void Output() {
        System.out.printf("Name: %s, ID: %d, Salary: %.2f$%n ", name, id, salary);
    }

    public String toString() {
        return String.format("[Name: %s, ID: %d, Salary: %.2f$]", name, id, salary);
    }

}
