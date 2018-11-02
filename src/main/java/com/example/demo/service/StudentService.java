package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.domain.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;

	public void studentpersist(Student student) {

		repo.save(student);

	}

	public List<Student> getStudentList() {

		List<Student> list = new ArrayList();
		list = repo.findAll();
		return list;

	}

}
