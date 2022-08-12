package com.BikkadIT.Service;

import java.util.List;

import com.BikkadIT.Model.User;

public interface ServiceI {

public int saveUserservice(User user);
	
	public List<User> getAllDataService();
	
	public User loginService(User user);
	
	public User updateService(User user);
	
	public User deleteService(int uid);
	
}
