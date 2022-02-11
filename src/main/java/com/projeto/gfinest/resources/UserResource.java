package com.projeto.gfinest.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.gfinest.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Marcelo", "maria@gmail.com", "999990000", "12345");
		return ResponseEntity.ok().body(u);
	}

}
