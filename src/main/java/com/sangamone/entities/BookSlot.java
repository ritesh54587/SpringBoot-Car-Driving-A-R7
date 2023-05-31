package com.sangamone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bookedSlot")
public class BookSlot {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	

    private String day;

    private String time;

    private Long teacher_id;
    
    private Long learner_id;
    private String date;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Long getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Long teacher_id) {
		this.teacher_id = teacher_id;
	}
	public Long getLearner_id() {
		return learner_id;
	}
	public void setLearner_id(Long learner_id) {
		this.learner_id = learner_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
    
}
