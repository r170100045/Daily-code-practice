import java.util.Scanner;

class EmployeeNotFoundException extends Exception{
	EmployeeNotFoundException(String s){
		super(s);
	}
}
public class Q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n = scn.nextInt();
		String[] emp = new String[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter the name of " + (i+1) + "th Employee");
			emp[i] = scn.next();
		}
		System.out.println("Enter the name of employee to check");
		String employee = scn.next();
		try {
			int j = 0;
			while(j < n) {
				if(employee.equals(emp[j])) {
					break;
				}else {
					j++;
				}
				if(j==n) {
					throw new EmployeeNotFoundException("this employee does not exist");
				}
			}
		}catch(EmployeeNotFoundException e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}finally {
			System.out.println("Employees are all good teamplayers");
		}

	}

}
