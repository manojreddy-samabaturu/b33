package com.batch.b33.Service;

import java.util.List;
import java.util.Optional;

import com.batch.b33.Entity.StudentEntity;

public interface ServiceMethods {
	 public StudentEntity insertStudent(StudentEntity se);
	 public List<StudentEntity>getAll();
	   public Optional findByStudentId(long studentId);
	   public List<StudentEntity> descorderbyname();

}
