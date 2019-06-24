package com.rasmus.app.school;

import com.rasmus.app.school.data.Course;
import com.rasmus.app.school.data.CourseDaoList;

public class App 
{
    public static void main( String[] args )
    {
    	CourseDaoList daoCourse = new CourseDaoList();
    	daoCourse.saveCourse(new Course("tempCourse", 4));
    	daoCourse.findAll();
    	
    }
}
