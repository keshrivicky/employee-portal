package com.online.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.employee.entity.User;
import com.online.employee.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public String test() {
		return "login";
	}

	@RequestMapping("/loginData")
	public String loginData(@ModelAttribute User user, Model model) {
		boolean result = loginService.UserNameAndPasswordValidate(user);

		if (!result) {
			model.addAttribute("message","User Name and password not correct !!");
			return "login";
		}
		
		return "home";
	}

}
