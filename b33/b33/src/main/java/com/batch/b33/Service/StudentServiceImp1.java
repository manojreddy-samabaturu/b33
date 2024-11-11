package com.batch.b33.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch.b33.Entity.StudentEntity;
import com.batch.b33.Repositary.StudentRepositary;

@Service
public class StudentServiceImp1 implements ServiceMethods {
	
	@Autowired
	private StudentRepositary StudentRepo;
   public StudentEntity insertStudent(StudentEntity se) {
		System.out.println(se);
		StudentRepo.save(se);
		return se;
}
   public List<StudentEntity>getAll(){
	   return StudentRepo.findAll();
   }
   public Optional<StudentEntity> findByStudentId(long studentId){

	   return StudentRepo.findById(studentId);

	   }
  
   public void deleteStudent(StudentEntity st) {
	   StudentRepo.delete(st);
		
	}
   public List<StudentEntity> descorderbyname(){
	   return StudentRepo.descorderbyname();
   }

}

