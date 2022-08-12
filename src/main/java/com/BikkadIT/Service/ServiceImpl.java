package com.BikkadIT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Dao.UserDaoImpl;
import com.BikkadIT.Model.User;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private UserDaoImpl userDao;

	@Override
	public int saveUserservice(User user) {
		System.out.println("service layer");
		System.out.println(user);
		int id = userDao.saveUserRepository(user);
		System.out.println(id);
		
		return id;
		
	}

	@Override
	public List<User> getAllDataService() {
		List<User> list = userDao.getAllDataDao();
		return list;
	}

	@Override
	public User loginService(User user) {
		User user1 = userDao.loginUserDao(user);
		return user1;
	}

	@Override
	public User updateService(User user) {
		User user2 = userDao.updateUserDao(user);
		return user2;
	}

	@Override
	public User deleteService(int uid) {
		User user = userDao.deleteUserDao(uid);
		return user;
		
		
	}
	
	
	
	
	

	
}
