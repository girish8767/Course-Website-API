package com.example.Course.courseDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Course.entities.course;

public interface courseDao extends JpaRepository<course, Long>{

}
