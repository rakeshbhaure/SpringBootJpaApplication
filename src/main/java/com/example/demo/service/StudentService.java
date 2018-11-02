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

	public List<Student> studentpersist() {

		Student s1 = new Student();
		s1.setName("rakesh");
		s1.setCourse("java");
		s1.setPhoneNo("7386690547");
		repo.save(s1);

		Student s2 = new Student();
		s2.setName("Rajesh");
		s2.setCourse("core java");
		s2.setPhoneNo("8686161508");
		repo.save(s2);

		Student s3 = new Student();
		s3.setName("sakshi");
		s3.setCourse(".net");
		s3.setPhoneNo("7013149523");
		repo.save(s3);

		List<Student> list = getStudentList();
		list.stream().forEach(System.out::println);
		return list;
	}

	public List<Student> getStudentList() {

		List<Student> list = new ArrayList();
		list = repo.findAll();
		return list;

	}

}
