package com.imooc.mvcdemo.service.impl;

import java.util.List;

import com.imooc.mvcdemo.dao.UserInfoMapper;
import com.imooc.mvcdemo.model.UserInfo;
import com.imooc.mvcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建时间：2015-1-27 下午5:22:59
 * 
 * @author andy
 * @version 2.2
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserById(int id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<UserInfo> getUsers() {
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(UserInfo userInfo) {
		
		int result = userInfoMapper.insert(userInfo);
		
		System.out.println(result);
		return result;
	}

}
