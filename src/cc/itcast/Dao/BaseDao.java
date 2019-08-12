package cc.itcast.Dao;

import java.util.List;

public interface BaseDao<T> {
	void add(T t);
	void delete(T t);
	void modify(T t);
	List<T> findAll();
	T findById(Integer id);
}
