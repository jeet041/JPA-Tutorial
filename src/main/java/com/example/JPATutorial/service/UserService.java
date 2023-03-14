package com.example.JPATutorial.service;

import java.util.List;

import com.example.JPATutorial.model.User;

public interface UserService {
	User saveUser (User user);
	List<User> finsAllUser ();
	User updateUser (User user);
}
