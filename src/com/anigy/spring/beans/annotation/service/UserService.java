package com.anigy.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.anigy.spring.beans.annotation.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("userJdbcRepository")
	private UserRepository userRepository;
	
	
	public void add() {
		System.out.println("UserService add ...");
		userRepository.save();
	}
	
}
