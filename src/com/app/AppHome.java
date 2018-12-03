package com.app;

import com.dao.UserDao;
import com.model.User;


public class AppHome {

	public static void main(String[] args) {
		System.out.println("Java + Hibernate + MySQL");
        
		User user = new User();
        user.setName("TestName1");
        
        UserDao dao = new UserDao();
        dao.saveUser(user);
        
        System.out.println("Record saved");
	}
}
