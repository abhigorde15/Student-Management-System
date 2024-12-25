package com.student_management_system.StudentManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student_management_system.StudentManagementSystem.entity.Student;
import com.student_management_system.StudentManagementSystem.service.StudentService;

import ch.qos.logback.core.model.Model;

@Controller
public class StudentController {
  StudentService service;
  
  public StudentController(StudentService service) {
	super();
	this.service = service;
}

@GetMapping("/students")
  public String ListStudents(ModelMap model) {
	  model.addAttribute("students",service.getAllStudents() );
	  return "students";
  }
 @GetMapping("/students/new")
  public String NewStudentForm(ModelMap model) {
	 Student student = new Student();
	  model.addAttribute("student",student);
	  return "create_student";
  }
 @PostMapping("/students")
 public String handleNewStudent(@ModelAttribute("student") Student student) {
	  service.addStudent(student);
	  return "redirect:/students";
 }
 @GetMapping("/students/edit/{id}")
 public String updateStudentPage(@PathVariable long id,ModelMap model) {
	 model.addAttribute("student", service.getStudentById(id));
	 return "update_page";
 }
 @PostMapping("/students/{id}")
 public String updateStudent(@ModelAttribute("student") Student student) {
	 service.updeteStudent(student);
	 return "redirect:/students";
 }
 @GetMapping("/students/delete/{id}")
 public String deleteStudentPage(@PathVariable long id,ModelMap model) {
	 Student student = service.getStudentById(id);
	 service.deleteStudent(student);
	 return "redirect:/students";
 }
 
}
