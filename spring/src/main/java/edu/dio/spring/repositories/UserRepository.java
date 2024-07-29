package edu.dio.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.dio.spring.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
