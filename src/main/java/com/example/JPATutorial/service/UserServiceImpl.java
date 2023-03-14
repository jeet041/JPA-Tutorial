package com.example.JPATutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPATutorial.Repos.UserRepository;
import com.example.JPATutorial.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> finsAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		List<User>users=userRepository.findByName(user.getName());
		if(!users.isEmpty()) {
			return userRepository.save(user);
		}else {
			return null;
		}
	}

}
