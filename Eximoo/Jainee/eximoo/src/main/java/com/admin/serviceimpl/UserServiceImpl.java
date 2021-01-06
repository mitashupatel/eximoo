package com.admin.serviceimpl;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.admin.dao.UserDao;

import com.admin.model.User;
import com.admin.service.UserService;
import com.admin.utills.FTPUtils;
import com.admin.utills.FileUtils;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	 @Autowired
	 UserDao userDao;
	 private static String UPLOADED_FOLDER1 = "F://Tools//apache-tomcat-9.0.30-windows-x64//apache-tomcat-9.0.30//webapps//eximoo//resources//images//user//";
	 public long saveUpdateUser(User user, MultipartFile file) {
		 	String newFileName = FileUtils.getFileName(file.getOriginalFilename());
		 	long userId = 0;
			user.setIsActive(1);
			user.setUserphoto(newFileName);
			userId = userDao.saveUpdateUser(user);
			
			if(user != null)
			{
				FileUtils.uploadImageFile(file, UPLOADED_FOLDER1+newFileName);
				FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName, newFileName);
			}
			
			return userId;
		}

	public User editUser(long userid) {
		return userDao.editUser(userid);
	}

	public boolean deleteUser(long userid) {
		return userDao.deleteUser(userid);
	}

	public List<User> getAll() {
		List<User> UserList = userDao.getAll();
		/*for (User User:UserList) {
			String fileName = User.getUserphoto();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}*/
		return UserList;	}

}
