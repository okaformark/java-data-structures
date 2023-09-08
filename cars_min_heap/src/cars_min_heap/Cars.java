package cars_min_heap;

import java.util.Scanner;

public class Cars {
	public int ID,year;
	public double price, mileage;
	public String make,model;
	
	
	 public void Input()
	    {
			 System.out.println("Enter make: ");
			 make = new Scanner(System.in).nextLine();
			 
			 System.out.println("Enter model: ");
			 model = new Scanner(System.in).nextLine();
			 
			 System.out.println("Enter ID: ");
			 ID = Integer.parseInt(new Scanner(System.in).nextLine());
			 
			 System.out.println("Enter year: ");
			 year = Integer.parseInt(new Scanner(System.in).nextLine());
			 
			 System.out.println("Enter mileage: ");
			 mileage = Double.parseDouble(new Scanner(System.in).nextLine());
			 
			 System.out.println("Enter price");
			 price = Double.parseDouble(new Scanner(System.in).nextLine());
	    }
	    public void Output()
	    {
	    	System.out.printf("Make: %1$s, Model: %2$s, ID: %3$s, Year: %4$s,Mileage: %5$s, Price: %6$s ", make, model, ID, year,mileage,price);

	    }
	    public String toString() 
	    {
	        return String.format("Make: %1$s, Model: %2$s, ID: %3$s, Year: %4$s, Mileage: %5$s, Price: %6$s ", make, model, ID, year,mileage,price);
	    }
}

