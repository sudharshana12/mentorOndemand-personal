package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Courses {
   @Id 
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int courseId;
   private String courseName;
   private int mentorId;
   private String mentorName;
   private int amount;
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getMentorId() {
	return mentorId;
}
public void setMentorId(int mentorId) {
	this.mentorId = mentorId;
}
public String getMentorName() {
	return mentorName;
}
public void setMentorName(String mentorName) {
	this.mentorName = mentorName;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
}
