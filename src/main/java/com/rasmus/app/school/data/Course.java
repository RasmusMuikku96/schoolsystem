package com.rasmus.app.school.data;

import java.time.LocalDate;
import java.util.List;

public class Course {
	
	private static int courseId = 0;
	
	private int id;
	private String courseName;
	private LocalDate startDate;
	private int weekDuration;
	private List<Student> students;
	
	
	public Course(String courseName, int weekDuration) {
		super();
		this.id = courseId++;
		this.courseName = courseName;
		this.startDate = LocalDate.now();
		this.weekDuration = weekDuration;
	}
	
	
	public void register(Student student){
		students.add(student);
	}
	public void unregister(Student student){
		students.remove(student);
	}

	public int getWeekDuration() {
		return weekDuration;
	}

	public void setWeekDuration(int weekDuration) {
		this.weekDuration = weekDuration;
	}

	public int getId() {
		return id;
	}

	public String getCourseName() {
		return courseName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	
	
	
}
