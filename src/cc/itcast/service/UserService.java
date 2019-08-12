package cc.itcast.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import c.itcast.entity.User;
import cc.itcast.Dao.UserDao;

@Transactional
public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) {
		return userDao.login(user);
		
	}

	public void regist(User user) {
		userDao.regist(user);
		
	}
	public List<User> findAll() {
		return userDao.findAll();
	}
}
