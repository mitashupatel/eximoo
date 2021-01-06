package com.admin.dao;

import java.util.List;


import com.admin.model.User;
public interface UserDao extends GenericDAO<User>{
 
	public long saveUpdateUser(User user);
	public User editUser(long userid);
	public boolean deleteUser(long userid);
	public List<User> getAll();
}
