package com.txdycmr.service.impl;

import com.txdycmr.dao.UserMapper;
import com.txdycmr.model.User;
import com.txdycmr.service.inter.IUserService;


public class UserServiceImpl implements IUserService {
	private UserMapper userMapper;

	public User findById(int id) {
		return userMapper.findById(id);
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
