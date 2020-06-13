package com.springbook.biz.user.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	/*@Autowired
	@Qualifier("userDAO")*/
	@Resource(name="userDAO")
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
/**/
	@Override
	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.getUser(vo);
	}
	
}
