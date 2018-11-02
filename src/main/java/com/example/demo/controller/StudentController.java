package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/list")
	public String getStudentList(Model model) {

		List<Student> studentList = service.studentpersist();
		model.addAttribute("students", studentList);
		return "studentpage";
	}

}
