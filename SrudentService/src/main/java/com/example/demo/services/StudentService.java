package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;
public String addStudent(Student student)
{
	Student student1=studentRepository.save(student);
	if(student1 !=null)
	{
		return "Student added";
	}
	return "Something Went wrong";
}
public String deleteStudentById(int id)
{
	studentRepository.deleteById(id);
	return "Student Deleted Sucessfully";
}
}
