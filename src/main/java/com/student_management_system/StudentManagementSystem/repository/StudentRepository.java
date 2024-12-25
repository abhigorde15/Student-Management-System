package com.student_management_system.StudentManagementSystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student_management_system.StudentManagementSystem.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Long>{

}
