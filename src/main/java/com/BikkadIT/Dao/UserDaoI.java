package com.BikkadIT.Dao;

import java.util.List;

import com.BikkadIT.Model.User;

public interface UserDaoI {
	
public int saveUserRepository(User user);
	
	public List<User> getAllDataDao();
	
	public User loginUserDao(User user);
	
	public User updateUserDao(User user);
	
	public User deleteUserDao(int uid);
}
