package edu.dio.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.dio.spring.models.User;
import edu.dio.spring.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private UserService userServ;
	
	@GetMapping
	ResponseEntity<List<User>> getAll(){
		List<User> users= userServ.getAllUsers();
		
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}")
	ResponseEntity<User> getUserById(@PathVariable long id){
		User u = userServ.getUserById(id);
		
		return new ResponseEntity<>(u, HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<User> createUser(@RequestBody User reqUser){
		reqUser.setId(null);
		User createdUser = userServ.createUser(reqUser);
		
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}
	
	@PutMapping
	ResponseEntity<User> updateUser(@RequestBody User reqUser){
		User createdUser = userServ.updateUser(reqUser);
		return new ResponseEntity<>(createdUser, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}")
	ResponseEntity<String> deleteUser(@PathVariable long id){
		userServ.deleteUser(id);
		
		String resStr = String.format("O usuário de id: %d foi deletado", id);
		return new ResponseEntity<>(resStr,HttpStatus.OK);
	}
}
