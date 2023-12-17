package com.example.Course.service;

import java.util.List;

import com.example.Course.entities.course;

public interface courseservice {
	public List<course> getcourse();
	
	public course getcoursebyid(long id);
	
	public course Addcourse(course course);
	
	public course updatecourse(course course);
	
	public void deletecourse(Long id);

}
