package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("/list")
	public String getStudentList(Model model) {

		List<Student> studentList = service.getStudentList();
		model.addAttribute("students", studentList);
		return "studentpage";
	}

	@GetMapping("/register")
	public String register(Model model) {
		Student s = new Student();
		model.addAttribute("student", s);
		return "register";

	}

	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute(value = "student") Student student) {
		service.studentpersist(student);
		return "success";
	}

}
