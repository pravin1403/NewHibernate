package com.BikkadIT.Controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.Model.User;
import com.BikkadIT.Service.ServiceImpl;

@Controller
public class CrudController {
	
	Scanner sc=new Scanner(System.in);
	
	@Autowired
	private ServiceImpl service;

	@Autowired
	private User user;
	
	public void saveUser() {

		System.out.println("Enter your Name");
		 String name=sc.next();
		 user.setName(name);
	
		
		
		System.out.println("Enter your username");
		String uname=sc.next();
		user.setUname(uname);
		
		System.out.println("Enter your email");
		String email=sc.next();
		user.setEmail(email);
		
		System.out.println("Enter your Password");
		String pwd=sc.next();
		user.setUpwd(pwd);
		
		int userservice = service.saveUserservice(user);
		System.out.println(userservice);
		


		
	}

	@GetMapping("/getAllData")
	public String getAllDataController(Model model) {

		List<User> list = service.getAllDataService();

		System.out.println(list);

		model.addAttribute("list", list);

		return "getAllData";

	}

	@PostMapping("/log")
	public String loginController(User user, Model model) {

		User user2 = service.loginService(user);
		if (user2 == null) {
			return "loginfail";
		}

		model.addAttribute("user", user2);
		return "loginSuccess";

	}

	@GetMapping("/update")
	public String updatePage() {

		return "update";

	}

	@PostMapping("/up")
	public String updateController(User user, Model model) {

		User user2 = service.updateService(user);
		model.addAttribute("user", user2);

		return "up";

	}

	@GetMapping("/delete")
	public String deletePage() {

		return "delete";

	}

	@GetMapping("/del")
	public String deleteController(int uid) {

		User user = service.deleteService(uid);
		if (user != null) {

			System.out.println(user);
			return "deleteSuccess";
		}
		return "deletefail";
	}

}
