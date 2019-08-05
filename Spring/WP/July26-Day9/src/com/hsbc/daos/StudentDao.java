package com.hsbc.daos;

import com.hsbc.models.Student;
import java.util.*;
public interface StudentDao {
	void createConnection();
	void addStudent(Student student);
	Student getStudent(int rollNo);
	List<Student> getAllStudents();
	void updateStudent(Student student);
	void deleteStudent(int rollNo);
	void closeConnection();
	

	}
