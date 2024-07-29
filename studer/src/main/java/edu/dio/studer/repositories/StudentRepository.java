package edu.dio.studer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.dio.studer.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
