package com.batch.b33.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.batch.b33.Entity.StudentEntity;
@Repository
public interface StudentRepositary extends JpaRepository<StudentEntity,Long> {
  @Query(value="select * from student order by firstname desc ",nativeQuery=true)
  public List<StudentEntity> descorderbyname(); 
  
}
