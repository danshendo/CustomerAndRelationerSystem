package cc.itcast.Dao;

import java.util.List;

import c.itcast.entity.User;

public interface UserDao {

	User login(User user);

	void regist(User user);

	List<User> findAll();

}
