package com.example.demo.resolver;

import com.example.demo.repository.UserRepository;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class QueryResolver {
	 private final UserRepository userRepository;

	    public QueryResolver(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<com.example.demo.model.User> getUsers() {
	        return userRepository.findAll();
	    }
}
