package com.dao;

import org.hibernate.Session;

import com.model.User;
import com.utility.HibernateUtil;

public class UserDao {
	
	public void saveUser(User user){
		System.out.println("saveUser called");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
	}
}
