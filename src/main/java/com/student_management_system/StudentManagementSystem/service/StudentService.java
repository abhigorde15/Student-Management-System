package com.student_management_system.StudentManagementSystem.service;

import java.util.List;

import com.student_management_system.StudentManagementSystem.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

	Student addStudent(Student student);

	Student getStudentById(long id);

	Student updeteStudent(Student student);

	void deleteStudent(Student student);
}
