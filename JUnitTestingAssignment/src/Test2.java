import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
public class Test2 {
	private Engineer suresh = new Engineer("Suresh", 26, "Mechanical");
	private int age;
	@Before
	public void findAge() {
		age = suresh.getAge();
	}
	@Test
	public void testGetAgeNegativeTest() {
		assertTrue(age == "abc"); // negative testing scenario
	}
	@AfterClass
	public static void testDone() {
		System.out.println("test done for class Test2");
	}
}
