package com.online.employee.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.online.employee.entity.Employee;
import com.online.employee.rowMapper.RowMapperImplForEmployee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addEmployee(Employee employee) {
		
		String query = "INSERT INTO `employee`.`employee_detail` (`emp_name`, `emp_id`, `emp_dept`) VALUES "
				+ "(?,?,?);";
		
		int result = this.jdbcTemplate.update(query,employee.getEmpName(),""+employee.getEmpId(),employee.getEmpDept());
		//return result;
		
	}

	public List<Employee> getEmployee() {
		String query = "SELECT * FROM `employee`.`employee_detail`";
		List<Employee> EmployeeResult= this.jdbcTemplate.query(query,new RowMapperImplForEmployee());
		return EmployeeResult;
		
	}

}
