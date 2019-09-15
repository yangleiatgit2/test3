package com.sky.service;

import com.sky.Student;

public class StudentService {
	public Student getStudentById() {
		Student student = new Student();
		student.setName("张龙");
		return student;
	}
}
