package edu.dio.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.dio.spring.models.User;
import edu.dio.spring.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User getUserById(long id){
		return userRepo.findById(id).orElse(new User());
	}
	
	public User createUser(User u) {
		return userRepo.save(u);
	}
	
	public User updateUser(User newUser) {
		User userToUpdate = userRepo.getReferenceById(newUser.getId());
		
		userToUpdate.setAge(newUser.getAge());
		userToUpdate.setName(newUser.getName());;
		
		return userRepo.save(userToUpdate);
	}
	
	public void deleteUser(long id) {
		userRepo.deleteById(id);
	}
}
