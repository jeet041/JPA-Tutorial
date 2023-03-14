package com.example.JPATutorial.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.JPATutorial.model.User;
import com.example.JPATutorial.service.UserService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/v1/")
public class RestController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("getDetails")
	public List<User> getDetails() {
		List<User> userDetails = new ArrayList<>();
	 try {
		userDetails.addAll(userService.finsAllUser());
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	 return userDetails;
	}
	
	@PostMapping("setDetails")
	public User setDetails( @RequestBody User user) {
		try {
			return userService.saveUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}

}
