package com.premsh.webappinitializer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
	private int id;
	@Value("Shiva")
	private String name;
	@Value("MSSHSS")
	private String school;
	@Value("10")
	private int grade;
	
	public int getId() {
		return id;
	}
	public Student() {

	}
	public Student(int id, String name, String school, int grade) {
		this.id = id;
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
