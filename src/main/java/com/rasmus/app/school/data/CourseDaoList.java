package com.rasmus.app.school.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoList implements CourseDao {
	private Course course; // = Course;
	private static List<Course> courses;
	

	@Override
	public Course saveCourse(Course course) {
		courses.add(course);
		return course;
	}

	@Override
	public Course findById(int id) {
		return course;
//		for(Course i : courses) {
//    		if(i.getId() == id) {
//    			List<Course> idList = new ArrayList<Course>();
//    			idList.add(i);
//    			return idList;
//    		}
//	    throw new NullPointerException("Something went terribly wrong");
//		}
	}

	@Override
	public List<Course> findByName(String name) {
		List<Course> nameList = new ArrayList<Course>();
		for(Course i : courses) {
    		if(i.getCourseName().equals(name)) {
    			nameList.add(i);
    			return nameList;
    		}
		}
		return nameList;
	}

	@Override
	public List<Course> findByDate(LocalDate date) {
		
		return null;
	}

	@Override
	public List<Course> findAll() {
		return courses;
	}

	@Override
	public boolean removeCourse(Course course) {
		return courses.remove(course);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseDaoList other = (CourseDaoList) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		return true;
	}
	
}

