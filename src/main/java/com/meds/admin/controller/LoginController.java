package com.meds.admin.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan({"com.ilink.meds.model"})
public class LoginController {

	@RequestMapping("/login")
	public String loginPage() {

		System.out.println("inside login conroller");
		return "login.jsp";
	}

	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout.jsp";
	}

	@RequestMapping("/")
	public String home() {

		return "home.jsp";

	}

}
