package cc.itcast.Dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class BaseDaoImp<T> extends HibernateDaoSupport implements BaseDao<T> {
	private Class clas;
	public BaseDaoImp() {
		Class clazz = this.getClass();
		ParameterizedType pp =  (ParameterizedType) clazz.getGenericSuperclass();
		Type[] ttp = pp.getActualTypeArguments();
		Class cls = (Class) ttp[0];
		this.clas = cls;
	}

	@Override
	public void add(T t) {
		this.getHibernateTemplate().save(t);
	}

	@Override
	public void delete(T t) {
		this.getHibernateTemplate().delete(t);
	}

	@Override
	public void modify(T t) {
		this.getHibernateTemplate().update(t);
	}

	@SuppressWarnings("all")
	@Override
	public List<T> findAll() {
		return (List<T>) this.getHibernateTemplate().find("from "+clas.getSimpleName());
	}

	@SuppressWarnings("all")
	@Override
	public T findById(Integer id) {
		return (T) this.getHibernateTemplate().get(clas, id);
	}

}
