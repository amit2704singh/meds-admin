package com.meds.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meds.model.User;
import com.meds.admin.service.UserRegistrationService;


@Controller
public class RegistrationController {

	@Autowired
	private UserRegistrationService userRegistrationService;

	@RequestMapping("/register")
	public String register() {
		return "registration.jsp";

	}

	@RequestMapping("/registration")
	public String register(User user) {
		userRegistrationService.registerUser(user);
		return "registration.jsp";

	}

}
