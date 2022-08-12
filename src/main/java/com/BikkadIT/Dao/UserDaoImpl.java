package com.BikkadIT.Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Model.User;
@Repository
public class UserDaoImpl implements UserDaoI{
	
	@Autowired
	private SessionFactory sf;

	@Override
	public int saveUserRepository(User user) {
		System.out.println("presistance layer");
		System.out.println(user);
		
		Session session = sf.openSession();
		session.beginTransaction();
		int id = (int) session.save(user);
		System.out.println(id);
		
		session.getTransaction().commit();
		return id;
	}

	@Override
	public List<User> getAllDataDao() {
		
		Session session = sf.openSession();
		String hql="from User";
		Query query = session.createQuery(hql);
		
		List list = query.getResultList();
		
		return list;
	}

	@Override
	public User loginUserDao(User user) {
		Session session = sf.openSession();
		String hql="from User";
		Query query = session.createQuery(hql);
		
		List<User> list = query.getResultList();
		
		for(User user1:list) {
			if(user.getUname().equals(user1.getUname()) && (user.getUpwd().equals(user1.getUpwd()))) {
				
			return user1;	
			}
		}
		return null;
	}

	@Override
	public User updateUserDao(User user) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sf.openSession();
		User user2 = session2.get(User.class, user.getUid());
		
		
		
		return user2;
	}

	@Override
	public User deleteUserDao(int uid) {
		Session session = sf.openSession();
		session.beginTransaction();
		User user = session.get(User.class, uid);
		if(user!=null) {
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		}
		
		return user;
	}

}
