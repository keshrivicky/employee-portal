package com.online.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.employee.DAO.LoginRepository;
import com.online.employee.entity.User;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	// username and password validation
	public boolean UserNameAndPasswordValidate(User user) {
		boolean result = false;

		if (user.getUsername() != null) {

			int userId = loginRepository.getByUserName(user.getUsername());
			if (userId > 0) {
				User userResult = loginRepository.getUserNameAndPassword(user);

				if (user.getUsername().equals(userResult.getUsername())
						&& user.getPassword().equals(userResult.getPassword())) {
					result = true;
				}
			}
		}
		return result;

	}

}
