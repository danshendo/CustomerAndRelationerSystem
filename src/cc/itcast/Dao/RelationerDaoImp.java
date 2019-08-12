package cc.itcast.Dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;

import c.itcast.entity.Relationer;

public class RelationerDaoImp implements RelationerDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings("all")
	@Override
	public List<Relationer> findAll() {
		List<Relationer> list =  (List<Relationer>) hibernateTemplate.find("from Relationer");
		return list;
	}
	
	public Relationer findById(Integer id) {
		@SuppressWarnings("all")
		List<Relationer> list = (List<Relationer>) hibernateTemplate.find("from Relationer where rid = ?0", id);
		return list.get(0);
	}
	
	@Override
	public List<Relationer> delete(Integer id) {
		Relationer relationer = findById(id);
		hibernateTemplate.delete(relationer);
		List<Relationer> list = findAll();
		return list;
	}

	@Override
	public List<Relationer> modify(Relationer relationer) {
		hibernateTemplate.update(relationer);
		List<Relationer> list = findAll();
		return list;
	}

	@Override
	public List<Relationer> add(Relationer relationer) {
		hibernateTemplate.save(relationer);
		List<Relationer> list = findAll();
		return list;
	}

	@SuppressWarnings("all")
	@Override
	public List<Relationer> find(Relationer relationer) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Relationer.class);
		if(relationer.getCustomer().getCid() != null && !"".equals(relationer.getCustomer().getCid())) {
			criteria.add(Restrictions.eq("Customer",relationer.getCustomer()));
		}
		if(relationer.getAddress()!= null && !"".equals(relationer.getAddress())) {
			criteria.add(Restrictions.eq("address",relationer.getAddress()));
		}
		if(relationer.getRname()!= null && !"".equals(relationer.getRname())) {
			criteria.add(Restrictions.eq("rname",relationer.getRname()));
		}
		List<Relationer> list = (List<Relationer>) hibernateTemplate.findByCriteria(criteria);
		return list;
	}
}
