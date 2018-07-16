package com.zhuhaoran.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.zhuhaoran.po.Question;
import com.zhuhaoran.test.getListQuestion;
import com.zhuhaoran.util.questionRandomUtil;

public class servletQuestion extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain;charset=utf-8");
		resp.setCharacterEncoding("utf-8");
		
		getListQuestion getlistquestion = new getListQuestion();
		List<Question> list = new ArrayList<Question>();
		try {
			list = getlistquestion.getList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		questionRandomUtil questionRandomUtil = new questionRandomUtil();
		int[] questionNum= null;
		questionNum = questionRandomUtil.getRandom(list.size());
		System.out.println(questionNum[0]+" "+questionNum[1]+" "+questionNum[2]+" "+questionNum[3]);
		System.out.println(list.get(0).getQuestion()+" "+list.get(1).getQuestion());
		
		PrintWriter out = resp.getWriter();
		JSONObject obj = new JSONObject();
		JSONObject obj1 = new JSONObject();
		JSONObject obj2 = new JSONObject();
		JSONObject obj3 = new JSONObject();
		JSONObject obj4 = new JSONObject();
		
		try {
			obj1.put("question", list.get(questionNum[0]).getQuestion());
			obj1.put("opA", list.get(questionNum[0]).getOpA());
			obj1.put("opB", list.get(questionNum[0]).getOpB());
			obj1.put("opC", list.get(questionNum[0]).getOpC());
			obj1.put("opD", list.get(questionNum[0]).getOpD());
			obj1.put("answer", list.get(questionNum[0]).getAnswer());
			
			obj2.put("question", list.get(questionNum[1]).getQuestion());
			obj2.put("opA", list.get(questionNum[1]).getOpA());
			obj2.put("opB", list.get(questionNum[1]).getOpB());
			obj2.put("opC", list.get(questionNum[1]).getOpC());
			obj2.put("opD", list.get(questionNum[1]).getOpD());
			obj2.put("answer", list.get(questionNum[1]).getAnswer());
			
			obj3.put("question", list.get(questionNum[2]).getQuestion());
			obj3.put("opA", list.get(questionNum[2]).getOpA());
			obj3.put("opB", list.get(questionNum[2]).getOpB());
			obj3.put("opC", list.get(questionNum[2]).getOpC());
			obj3.put("opD", list.get(questionNum[2]).getOpD());
			obj3.put("answer", list.get(questionNum[2]).getAnswer());
			
			obj4.put("question", list.get(questionNum[3]).getQuestion());
			obj4.put("opA", list.get(questionNum[3]).getOpA());
			obj4.put("opB", list.get(questionNum[3]).getOpB());
			obj4.put("opC", list.get(questionNum[3]).getOpC());
			obj4.put("opD", list.get(questionNum[3]).getOpD());
			obj4.put("answer", list.get(questionNum[3]).getAnswer());
			
			obj.put("question1", obj1);
			obj.put("question2", obj2);
			obj.put("question3", obj3);
			obj.put("question4", obj4);
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.toString());
		out.print(obj.toString());
		out.flush();
		out.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
	

}
