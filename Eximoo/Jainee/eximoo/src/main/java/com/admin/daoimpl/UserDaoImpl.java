package com.admin.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.dao.UserDao;
import com.admin.model.Admin;
import com.admin.model.User;
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {
    
protected static SessionFactory sessionFactory;
	
public long saveUpdateUser(User user) {
	return super.saveUpdateObject(user).getUserid();
}

	public User editUser(long userid) {
		return super.getById(User.class, userid);	}

	public boolean deleteUser(long userid) {
		User user = super.getById(User.class, userid);
		user.setIsDeleted(1);
		return super.updateObject(user).getUserid() > 0;
	}

	public List<User> getAll() {
		return (List<User>) super.getByQuery("FROM User a WHERE isDeleted=0");
	}

	

}
