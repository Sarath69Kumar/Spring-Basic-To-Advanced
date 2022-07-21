package com.sarath.student.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.sarath.student.dal.entitiesJPA.Student;

//This does the CRUD operation
public interface StudentReposInterfce extends CrudRepository<Student, Long>		//args contains the <"Entity" , type of ID which is "Long">
{

}
