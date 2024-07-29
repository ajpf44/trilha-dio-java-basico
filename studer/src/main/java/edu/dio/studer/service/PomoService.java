package edu.dio.studer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.dio.studer.dto.PomoDTO;
import edu.dio.studer.models.Pomo;
import edu.dio.studer.models.Student;
import edu.dio.studer.repositories.PomoRepository;
import edu.dio.studer.repositories.StudentRepository;

@Service
public class PomoService {
	
	@Autowired
	private PomoRepository pomoRepo;
	@Autowired
	private StudentRepository studRepo;
	
	public Pomo create(PomoDTO dto) {
		Optional<Student> std = studRepo.findById(dto.getStudentId());
		
		if(std.isPresent()) {
			Pomo p = new Pomo(dto);
			p.setStudent(std.get());
			
			return pomoRepo.save(p);
		}
		
		return new Pomo();
	}
}
