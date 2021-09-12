package jdbc.rohit;
import java.sql.*;

public class Employee {
	String name;
	int age;
	int salary;
	String designation;
	Employee(String name, int age, int salary, String designation){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getSalary(){
		return salary;
	}
	String getDesignation() {
		return designation;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/EmployeeClass", "rohit", "");
		Statement st = connect.createStatement();
		String update = "";
		update = "create table Employee(Name varchar(20), Age INT, Salary INT, Designation varchar(30))";
		st.executeUpdate(update);	
		update = "INSERT INTO Employee (Name, Age, Salary, Designation) VALUES ('Ramesh', 30, 50000, 'Manager')";
		st.executeUpdate(update);
		update = "INSERT INTO Employee (Name, Age, Salary, Designation) VALUES ('Suresh', 35, 54000, 'Supervisor')";
		st.executeUpdate(update);
		update = "INSERT INTO Employee (Name, Age, Salary, Designation) VALUES ('Rakesh', 33, 52000, 'Technician')";
		st.executeUpdate(update);
		update = "INSERT INTO Employee (Name, Age, Salary, Designation) VALUES ('Navin', 36, 52000, 'Head of Operations')";
		st.executeUpdate(update);
		String query = "SELECT * FROM Employee "
				+ "ORDER BY Age";
		ResultSet result = st.executeQuery(query);
		while(result.next()) {
			Employee emp = new Employee(result.getString(1), result.getInt(2), result.getInt(3), result.getString(4));
			System.out.println(emp.getName() +"\t" + emp.getAge()+"\t" + emp.getSalary()+"\t" + emp.getDesignation());
		}
		connect.close();
		st.close();
	}

}
