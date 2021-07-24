public class Engineer {
	private String name;
	private int age;
	private String sector;
	public Engineer(String name, int age, String sector) {
		this.name = name;
		this.age = age;
		this.sector = sector;
	}
	public int getSalary() {
		int salary = 50000;
		return salary;
	}
	public int getAge() {
		return age;
	}
}
