package com.zhuhaoran.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zhuhaoran.mapper.QuestionMapper;
import com.zhuhaoran.mapper.UserMapper;
import com.zhuhaoran.po.Question;
import com.zhuhaoran.po.User;

public class getListQuestion {
	
	private SqlSessionFactory sqlSessionFactory;

	public List<Question> getList() throws Exception{
		
		//Mybatis
		// 配置文件
		String resources = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resources);

		// 使用SqlSessionFactoryBuilder从xml配置文件中创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		
		// 数据库会话实例
		SqlSession sqlSession = null;
		
			// 创建数据库会话实例sqlSession
			sqlSession = sqlSessionFactory.openSession();
			// 查询单个记录，根据用户id查询用户信息
			
			QuestionMapper questionMapper = sqlSession.getMapper(QuestionMapper.class);
			List<Question> list = questionMapper.findAllQuestion();
			// 输出用户信息
			System.out.println(list.get(0));
			return list;
		
		
	}
	
	public static void main(String[] args) throws Exception {
		getListQuestion getListQuestio = new getListQuestion();
		getListQuestio.getList();
	}
}
