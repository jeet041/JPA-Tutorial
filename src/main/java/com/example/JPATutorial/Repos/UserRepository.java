package com.example.JPATutorial.Repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.JPATutorial.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	 List<User> findByName(String name);
	 List<User> findAll();
	 @SuppressWarnings("unchecked")
	User save(User user);
}
