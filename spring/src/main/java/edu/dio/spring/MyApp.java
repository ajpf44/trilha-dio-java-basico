package edu.dio.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.dio.spring.models.LogMethods;
import edu.dio.spring.models.MsgSys;
import edu.dio.spring.models.User;
import edu.dio.spring.repositories.UserRepository;

@Component
public class MyApp implements CommandLineRunner{
	@Autowired
	private LogMethods logMethods;
	@Autowired
	private MsgSys msgSys;
	@Autowired
	private UserRepository userRepo;
	@Override
	public void run(String... args) throws Exception {

		if (args.length > -1) return;	// skip the execution of the code below.

		//logMethods.logTenTimes();
		
//		msgSys.sentGreetingMsg();
//		msgSys.revelTheSecretMsg();
//		logMethods.logDoc();
		
		userRepo.save(new User( "Alex", 25));
		userRepo.save(new User("Ronaldo", 48));
		userRepo.save(new User( "Mariana", 30));
		userRepo.save(new User( "Lucas", 22));
		userRepo.save(new User( "Ana", 35));
		userRepo.save(new User( "Carlos", 42));
		userRepo.save(new User( "Fernanda", 27));
		userRepo.save(new User( "Gustavo", 31));

		long count = userRepo.count();
		System.out.println("Número de registros: " + count);
		
		List<User> users = userRepo.findAll();
		
		for( User user: users) {
			System.out.println(user.toString());
		}
	}
}
