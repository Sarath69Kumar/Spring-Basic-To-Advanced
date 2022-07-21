package com.sarath.student.dal.studentdal;

import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sarath.student.dal.entitiesJPA.Student;
import com.sarath.student.dal.repository.StudentReposInterfce;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class StudentdalApplicationTests 
{
	//Spring to-do dependency injection on runtime
	@Autowired
	private StudentReposInterfce studentRepo;
	private Student student;
	
	@Test
	@Order(1)
	public void testCreateStudent()
	{
		student = new Student();
		student.setName("Keerthu");
		student.setCourse("Java");
		student.setFee(30d);
		studentRepo.save(student);
	}
	
	@Test
	@Order(2)
	public void testFindStudentById()
	{
		student = checkStudent();
		if(student != null)
		{
			//Optional<Student> student = studentRepo.findById(1L);
			//boolean studentFound = student.isPresent();
			//String studentDetails;
			//studentDetails = !studentFound ? "No student found" : student.toString() ;
			System.out.println(student);
		}
	}
	
	@Test
	@Order(3)
	public void testUpdateStudent()
	{
		student = checkStudent();
		if(student != null)
		{
			student.setFee(70d);
			studentRepo.save(student);
		}
	}
	
	private Student checkStudent()
	{
		student = studentRepo.findById(1l).orElse(null);
		if(student != null)
			return student;
		else
			return null;
	}
}
