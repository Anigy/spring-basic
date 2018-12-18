package com.anigy.spring.beans.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anigy.spring.beans.annotation.TestObject;

@Controller
public interface UserRepository {
	
	void save();
	
}
