package edu.dio.studer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.dio.studer.dto.StudentDTO;
import edu.dio.studer.models.Student;
import edu.dio.studer.service.StudentService;

@RestController
@RequestMapping(value="/students")
public class StudentController 
{
	@Autowired
	private StudentService studServ;
	
	@GetMapping
	ResponseEntity<List<Student>> getAll(){
		List<Student> students = studServ.getAll(); 
		
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Student> createStudent(@RequestBody StudentDTO sDTO){
		Student newStudent = studServ.create(sDTO);
		return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
	}
}
