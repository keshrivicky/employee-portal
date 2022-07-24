package com.online.employee.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.online.employee.entity.User;
import com.online.employee.rowMapper.RowMapperImplForUser;

@Repository
public class LoginRepository {
	
	//Database query
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User getUserNameAndPassword(User user){
		
		String query = "SELECT * FROM employee.user where username = ?";
		User userResult= this.jdbcTemplate.queryForObject(query,new RowMapperImplForUser(),user.getUsername());
		return userResult;
		
	}

	public int getByUserName(String username) {
		String query = "SELECT count(*) FROM employee.user where username = ?";
		int result = this.jdbcTemplate.queryForObject(query,new Object[] { username}, Integer.class);
		return result;
	}

}
