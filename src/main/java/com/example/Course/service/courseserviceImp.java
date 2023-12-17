package com.example.Course.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Course.courseDao.courseDao;
import com.example.Course.entities.course;

@Service
public class courseserviceImp implements courseservice {

	@Autowired
	private courseDao dao;
	
	public List<course> getcourse()
	{
		return dao.findAll();
	}
	
	
	@SuppressWarnings("deprecation")
	public course getcoursebyid(long id)
	{
	
		return dao.getReferenceById(id);
	}
	@Override
	public course Addcourse(course course) {
		
		dao.save(course);
		return course;
	}
	
	public course updatecourse(course course)
	{
		dao.save(course);
		return course;
	}
	
	public void deletecourse(Long parseLong)
	{
		dao.delete(dao.getOne(parseLong));
	}
}
