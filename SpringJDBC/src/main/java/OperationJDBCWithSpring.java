import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class OperationJDBCWithSpring {
	public static void main(String[] args) throws SQLException {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/Company");
		dataSource.setUsername("rohit");
		dataSource.setPassword("211099");
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String insertQuery = "insert into EMPLOYEE(id, first_name, last_name, salary) values (?, ?, ?, ?)";
		String updateQuery = "update EMPLOYEE set salary=? where id=?";
		String deleteQuery = "delete from EMPLOYEE where id=? ";
		String selectQuery = "select * from EMPLOYEE";		
		
		// creating rows in table
//		template.update(insertQuery, 101, "rohit", "meena", 500000);
//		template.update(insertQuery, 102, "rohit", "sharma", 600000);
//		template.update(insertQuery, 103, "sandeep", "sagar", 400000);
//		
		// updating rows in table
//		template.update(updateQuery, 100000, 102);
	        List<Employee> listEmployee = template.query(selectQuery, new RowMapper<Employee>() {
	 
	            public Employee mapRow(ResultSet result, int rowNum) throws SQLException {
	                Employee emp = new Employee();
	                emp.setId(result.getInt("id"));
	                emp.setFirstName(result.getString("first_name"));
	                emp.setLastName(result.getString("last_name"));
	                emp.setSalary(result.getInt("salary"));
	                 
	                return emp;
	            }
	             
	        });
	         
	        for (Employee emp : listEmployee) {
	            System.out.println(emp);
	        }
		System.out.println("done");
	}
}
