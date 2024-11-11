package com.batch.b33.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "student")
public class StudentEntity {
	 private int id;
     private String Name;
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY )
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		}
	@Column(name = "firstname", nullable = false)
	public String getName() {
	return Name;
	}
	public void setName( String Name) {
	this.Name = Name;
	}
	
	
	
	public StudentEntity() {}
	public StudentEntity(int id, String Name) {
	this.id = id;
	this.Name = Name;
	}
	@Override
	public String toString() {
		return id+":"+Name;
	}
	
	
}
