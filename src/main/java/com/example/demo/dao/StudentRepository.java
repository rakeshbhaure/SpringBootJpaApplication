package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public Student findById(long id);

	Student save(Student student);

}
