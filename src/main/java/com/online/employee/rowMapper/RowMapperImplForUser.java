package com.online.employee.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.online.employee.entity.User;

public class RowMapperImplForUser implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		return user;
	}

}