package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Courses;

public interface CourseDao extends JpaRepository<Courses, Integer>{

}
