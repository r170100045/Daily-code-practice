import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
public class Test1 {
	Engineer ramesh = new Engineer("Ramesh", 30, "Software");
	int salary;
	@Before
	public void findSalary() {
		salary = ramesh.getSalary();
	}
	@Test
	public void testGetSalaryPass() {
		assertEquals(salary, 50000); 
	}
	@Test
	public void testGetSalaryFail() {
		assertEquals(salary, 30000);
	}
	@AfterClass
	public static void testDone() {
		System.out.println("test done for class Test1");
	}
}
