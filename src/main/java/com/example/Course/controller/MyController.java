package com.example.Course.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Course.entities.course;
import com.example.Course.service.courseservice;

@RestController
public class MyController
{
	
	@Autowired
	private courseservice courseservice;
	

	@GetMapping("/courses")
	public List<course> getcourses()
	{
		return this.courseservice.getcourse()  	;
	}
	
	@GetMapping("/courses/{id}")
	public course getcourse(@PathVariable String id )
	{
	
		return this.courseservice.getcoursebyid(Long.parseLong(id));
	}
	
	@RequestMapping(value = "/courses", method = RequestMethod.POST)
	public course Addcourse(@RequestBody course course)
	{	
		return this.courseservice.Addcourse(course);
	}
	
	@PutMapping("/courses/{id}")
	public course updatecourse(@RequestBody course course)
	{
		return this.courseservice.updatecourse(course);
	}
	
	@DeleteMapping("/courses/delete/{id}")
	public ResponseEntity<HttpStatus> deletecourse(@PathVariable String id)
	{
		try
		{
			this.courseservice.deletecourse(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
