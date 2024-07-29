package edu.dio.studer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.dio.studer.dto.StudentDTO;
import edu.dio.studer.models.Student;
import edu.dio.studer.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studRepo;
	
	public List<Student> getAll(){
		return studRepo.findAll();
	}
	
	public Student create(StudentDTO sDTO) {
		return studRepo.save(new Student(sDTO));		
	}
}
