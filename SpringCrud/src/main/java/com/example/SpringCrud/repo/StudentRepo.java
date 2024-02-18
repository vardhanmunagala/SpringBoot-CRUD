package com.example.SpringCrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringCrud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	
	

}
