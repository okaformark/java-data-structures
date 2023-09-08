package sortedArray;

public class SortedArrayEmployee {

		public static Employee[] employees;
		public int currentSize;

		public SortedArrayEmployee(int scale)
		{
			employees = new Employee [scale];
			currentSize = 0;
		}
		
        public int BinarySearch(int id) {
            int k = 0;
            int lower = 0;
            int upper = currentSize - 1;
            while (lower < upper) {
                k = (lower + upper + 1) / 2;
                if (id == employees[k].id) {
                    break;
                }
                if (id < employees[k].id) {
                    upper = k - 1;
                } else {
                    lower = k + 1;
                }
            }
            if (lower == upper) {
                k = lower;
            }
            if (id == employees[k].id) {
                return k;
            } else {
                System.out.println("Error!. Employee not found");
                return -1;
            }
        }


		
		public final void insertion(Employee employee)
		{
			if (currentSize == 0)
			{
				employees[0] = employee;
			}
			/* find the position for inserting the given item */
			int position = 0;
			while (position < currentSize && employee.id > employees[position].id )
			{
				position++;
			}
			for (int i = currentSize; i > position; i--)
			{
				employees[i] = employees[i - 1];
			}
			employees[position] = employee;
			currentSize = currentSize + 1;
		}
        public final void deletion(int id) {
            /* find the given item */
            int position = BinarySearch(id);
            if (position != -1) {
                for (int i = position; i < currentSize - 1; i++) {
                	employees[i] = employees[i + 1];
                }
                currentSize = currentSize - 1;
            };
            
        }

        public final void remove() {
            currentSize--;
        }

        public final void display() {
            if (currentSize != 0) {
                for (int i = 0; i < currentSize; i++) {
                    System.out.println(employees[i]);
                }
            };
            
            System.out.println("The sie of the employee array is:  " + currentSize);
        }

		
		public final Employee EmployeeWithHighestSalary () {
			Employee withMaxSalary = employees[0];
			withMaxSalary.salary = employees[0].salary;
			for (int i = 1; i < currentSize; i++) {
				if(withMaxSalary.salary < employees[i].salary) {
					withMaxSalary = employees[i];
				}
			}
			return withMaxSalary;
		}
		
		public final double AverageSalary() {
			//int count = employees.length;
			double aveSalary = 0;
			for (int i = 0; i < currentSize; i++) {
				aveSalary += employees[i].salary;
			}
			return aveSalary/ currentSize;
		}

	}

