package com.zhuhaoran.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhuhaoran.po.Student;
import com.zhuhaoran.test.putScore;

public class studentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/plain;charset=utf-8");
		resp.setCharacterEncoding("utf-8");
		String scoreString = req.getParameter("score");
		double score = Double.parseDouble(scoreString);
		
		Date time = new Date();
		String name = "test@"+time.toString();
		System.out.println(time);
		Student student = new Student();
		student.setName(name);
		student.setScore(score);
		student.setTime(time);
		putScore putScore = new putScore();
		try {
			putScore.putScores(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
	

}
