package com.zhuhaoran.mapper;

import com.zhuhaoran.po.User;

public interface UserMapper {

	public User findUserById(int id) throws Exception;
}
