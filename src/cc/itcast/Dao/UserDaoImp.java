package cc.itcast.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import c.itcast.entity.User;

public class UserDaoImp implements UserDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public User login(User user) {
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) hibernateTemplate.find("from User where username=?0 and phonenumber=?1",
				user.getUsername(),user.getPhonenumber());
		for (User user2 : list) {
			if(user.getUsername().equalsIgnoreCase(user2.getUsername())
					&& user.getPhonenumber().equalsIgnoreCase(user2.getPhonenumber())) 
				return user2;
		}
		return null;
	}

	@Override
	public void regist(User user) {
		hibernateTemplate.save(user);
	}

	@SuppressWarnings("all")
	@Override
	public List<User> findAll() {
		return (List<User>) hibernateTemplate.find("from User");
	}
}
