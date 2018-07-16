package com.zhuhaoran.po;

import java.util.Date;

public class Student {

	
	private int id;
	private String name;
	private double score;
	private Date time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score
				+ ", time=" + time + "]";
	}
	
	
}
