package com.zhuhaoran.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.json.JSONException;
import org.json.JSONObject;

import com.zhuhaoran.mapper.UserMapper;
import com.zhuhaoran.po.User;
import com.zhuhaoran.test.getUser;

public class searchServlet extends HttpServlet{

	private SqlSessionFactory sqlSessionFactory;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain;charset=utf-8");
		String id = req.getParameter("id");
		int idd = Integer.parseInt(id);
		
				////////////////////////////
				resp.setCharacterEncoding("utf-8");
				PrintWriter out = resp.getWriter();
				JSONObject obj = new JSONObject();
				
				try {
					getUser getUser = new getUser();
					User user = getUser.getUsers(idd);
					obj.put("result", "ok");
					obj.put("id", user.getId());
				obj.put("name", user.getUsername());
				obj.put("password", user.getPassword());
				obj.put("address", user.getAddress());
				obj.put("phone", user.getPhone());
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println(obj.toString());
				out.print(obj.toString());
				out.flush();
				out.close();
				/////////////////////
				
			
				
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	public static void main(String[] args) {
		System.out.println("123");
	}
	

}
