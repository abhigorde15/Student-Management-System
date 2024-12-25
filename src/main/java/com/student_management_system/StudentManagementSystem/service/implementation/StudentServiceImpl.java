package com.student_management_system.StudentManagementSystem.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student_management_system.StudentManagementSystem.entity.Student;
import com.student_management_system.StudentManagementSystem.repository.StudentRepository;
import com.student_management_system.StudentManagementSystem.service.StudentService;
@Service
public class StudentServiceImpl  implements StudentService{
	StudentRepository repository;
	

	public StudentServiceImpl(StudentRepository repository) {
		super();
		this.repository = repository;
	}


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	@Override
	public Student addStudent(Student student) {
		return repository.save(student);
	}


	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	@Override
	public Student updeteStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}


	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		 repository.delete(student);
	}

}
