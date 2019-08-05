package com.hsbc.services;

import java.util.List;

import com.hsbc.models.Student;

public interface StudentService {
	void create(Student student);
	Student get(int  rollNo);
	List<Student> getAll();
	void modify(Student student);
	void remove(int rollNo);
}
