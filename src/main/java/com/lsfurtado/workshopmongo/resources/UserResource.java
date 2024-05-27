package com.lsfurtado.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsfurtado.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User lucas = new User("1", "Lucas Soares", "lucas@gmail.com");
		User pedro = new User("2", "Pedro Silva", "pedro@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(lucas, pedro));
		return ResponseEntity.ok().body(list);
	}
}
