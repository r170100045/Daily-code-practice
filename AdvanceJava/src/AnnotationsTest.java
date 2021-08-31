import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention (RetentionPolicy.RUNTIME)
@interface isEmployee{}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Location{
	String location() default "Hyderabad";
}

@Retention (RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CompanyDetails{
	String nameOfCompany() default "Beehyv";
	int sizeOfCompany() default 200;
}

@isEmployee
@CompanyDetails(nameOfCompany="Google")
class Employee{
	int age;
	int salary;
	
	public Employee(int age, int salary) {
		this.age = age;
		this.salary = salary;
	}

	@Location(location="Telangana")
	public void locationFromAnnotaion(){}
}
public class AnnotationsTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Employee emp = new Employee(25,50000);
		Method m = emp.getClass().getMethod("locationFromAnnotaion");
		Location loc = m.getAnnotation(Location.class);
		Class empClass = emp.getClass();
		if(empClass.isAnnotationPresent(isEmployee.class)) {
			System.out.println("yes our object is an employee as the isEmployee Annotaion is present");
		}
		CompanyDetails cd = (CompanyDetails) empClass.getAnnotation(CompanyDetails.class);
		System.out.println("Location of Employee is " + loc.location());
		System.out.println("Name of company is " + cd.nameOfCompany() + " and number of Employees in company are " + cd.sizeOfCompany());

	}

}
