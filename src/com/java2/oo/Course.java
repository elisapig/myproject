package com.java2.oo;

public class Course {
	
	String  id;
	String name;
	int weekday;
	int hour;
	int duration;
	
	
	public Course( String id,String name, int weekday, int hour, int duration) {
		super();
		this.name = name;
		this.id = id;
		this.weekday = weekday;
		this.hour = hour;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWeekday() {
		return weekday;
	}
	public void setWeekDay(int weekday) {
		this.weekday = weekday;
	}
	public int getTime() {
		return hour;
	}
	public void setTime(int hour) {
		this.hour = hour;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isAvailable(int weekday2, int hour2) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
