package com.zhuhaoran.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zhuhaoran.mapper.StudentMapper;
import com.zhuhaoran.mapper.UserMapper;
import com.zhuhaoran.po.Student;
import com.zhuhaoran.po.User;

public class putScore {

	private SqlSessionFactory sqlSessionFactory;
	
	public void putScores(Student student) throws Exception{
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
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			studentMapper.insertStudent(student);
			sqlSession.commit();
			sqlSession.close();
			// 输出用户信息
			System.out.println(student);
		
	}
}
