package cc.itcast.Dao;


import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;

import c.itcast.entity.Customer;

public class CustomerDaoImp implements CustomerDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List<Customer> findAll() {
		@SuppressWarnings("all")
		List<Customer> list = (List<Customer>) hibernateTemplate.find("from Customer");
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Customer findById(String id) {
		Integer idd = Integer.valueOf(id);
		List<Customer> list = (List<Customer>) hibernateTemplate.find("from Customer where cid=?0 ", idd);
		return list.get(0);
	}

	@Override
	public List<Customer> delete(Customer customer) {
		hibernateTemplate.delete(customer);
		List<Customer> list = findAll();
		return list;
	}

	@Override
	public List<Customer> modify(Customer customer) {
		hibernateTemplate.update(customer);
		List<Customer> list = findAll();
		return list;
	}

	@Override
	public List<Customer> add(Customer customer2) {
		hibernateTemplate.save(customer2);
		List<Customer> list = findAll();
		return list;
	}

	@Override
	public Integer findall() {
		@SuppressWarnings("all")
		List<Customer> list = (List<Customer>) hibernateTemplate.find("from Customer");
		int count = list.size();
		return count;
	}

	@SuppressWarnings("all")
	@Override
	public List<Customer> findPart(Integer begin, Integer onepagecount) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		List<Customer> list = (List<Customer>) hibernateTemplate.findByCriteria(criteria, begin, onepagecount);
		return list;
	}

	@Override
	public List<Customer> findlike(String cname) {
		@SuppressWarnings("all")
		List<Customer> list = (List<Customer>) hibernateTemplate.find("from Customer where cname like '%"+cname+"%'");
		return list;
	}

	@Override
	public List<Customer> find(Customer customer1) {
//		String hql = "from Customer where 1=1 ";
//		List<Object> list  = new ArrayList<Object>();
//		if(customer1.getCname() != null && !"".equals(customer1.getCname())) {
//			hql +=  " and cname=?0 ";
//			list.add(customer1.getCname());
//		}
//		if(customer1.getResource() != null && !"".equals(customer1.getResource())) {
//			hql += " and resource=?1 ";
//			list.add(customer1.getResource());
//		}
//		if(customer1.getLevel() != null && !"".equals(customer1.getLevel())) {
//			hql += " and level=?2 ";
//			list.add(customer1.getLevel());
//		}
//		@SuppressWarnings("unchecked")
//		List<Customer> list1 = (List<Customer>) hibernateTemplate.find(hql, list.toArray());
//		return list1;
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		if(customer1.getCname() != null && !"".equals(customer1.getCname())) {
			criteria.add(Restrictions.eq("cname", customer1.getCname()));
		}
		if(customer1.getResource() != null && !"".equals(customer1.getResource())) {
			criteria.add(Restrictions.eq("resource", customer1.getResource()));
		}
		if(customer1.getLevel() != null && !"".equals(customer1.getLevel())) {
			criteria.add(Restrictions.eq("level", customer1.getLevel()));
		}
		@SuppressWarnings("all")
		List<Customer> list1 = (List<Customer>) hibernateTemplate.findByCriteria(criteria);
		return list1;
	}


	

}
