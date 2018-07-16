package com.zhuhaoran.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zhuhaoran.mapper.UserMapper;
import com.zhuhaoran.po.User;

public class tests {

	/**
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 SqlSessionFactory sqlSessionFactory = null;
			// 配置文件
			String resource = "SqlMapConfig.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);

			// 使用SqlSessionFactoryBuilder从xml配置文件中创建SqlSessionFactory
			sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(inputStream);
			SqlSession sqlSession = null;
			try {
				// 创建数据库会话实例sqlSession
				sqlSession = sqlSessionFactory.openSession();
				// 查询单个记录，根据用户id查询用户信息
				UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
				User user = userMapper.findUserById(1);
				// 输出用户信息
				System.out.println(user);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (sqlSession != null) {
					sqlSession.close();
				}
			}
	}

}
