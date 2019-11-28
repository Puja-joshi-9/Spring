package com.bwat.springproject.dao;

import com.bwat.springproject.model.User;

public interface UserDao {
	
	void signup(User u);
	User login(String un, String psw);

}
