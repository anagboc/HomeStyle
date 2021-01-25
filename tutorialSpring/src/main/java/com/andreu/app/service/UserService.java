package com.andreu.app.service;



import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.andreu.app.entity.Users;

public interface UserService {

	public Iterable<Users> findAll();
	
	public Page<Users> findAll(Pageable pageable);
	
	public Optional<Users> findById(Long id);
	
	public Users save(Users user);
	
	public void deleteById(Long id); 
}
