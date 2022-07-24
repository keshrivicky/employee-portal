package com.online.employee.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.online.employee.entity.Employee;
import com.online.employee.entity.User;

public class RowMapperImplForEmployee implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmpName(rs.getString("emp_name"));
		employee.setEmpId(Integer.parseInt(rs.getString("emp_id")));
		employee.setEmpDept(rs.getString("emp_dept"));
		return employee;
	}

}