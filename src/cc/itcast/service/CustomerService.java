package cc.itcast.service;

import java.util.List;



import org.springframework.transaction.annotation.Transactional;

import c.itcast.entity.Customer;
import c.itcast.entity.PageBean;
import cc.itcast.Dao.CustomerDao;

@Transactional
public class CustomerService {
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public List<Customer> findAll() {
		return  customerDao.findAll();
		
	}

	public List<Customer> delete(Customer customer) {
		customerDao.delete(customer);
		return customerDao.findAll();
	}

	public Customer findById(String id) {
		return customerDao.findById(id);
	}

	public List<Customer> modify(Customer customer) {
		return customerDao.modify(customer);
		
	}

	public List<Customer> add(Customer customer2) {
		return customerDao.add(customer2);
		
	}

	public Integer findall() {
		
		return customerDao.findall();
	}

	public List<Customer> findPart(Integer begin, Integer onepagecount) {
		return customerDao.findPart(begin,onepagecount);
	}

	public PageBean pageBean(Integer cruentpage) {
		PageBean pageBean = new PageBean();
		Integer onepagecount = 3;
		pageBean.setOnepagecount(onepagecount);
		pageBean.setCruentpage(cruentpage);
		int onepage = onepagecount;
		int cruent = cruentpage;
		int begin = (cruent-1)*onepage;
		pageBean.setBegin(begin);
		pageBean.setTotalcount(findall());
		int pagecount;
		if(pageBean.getTotalcount()%pageBean.getOnepagecount() == 0 ) {
			pagecount = pageBean.getTotalcount()/pageBean.getOnepagecount();
		}else {
			pagecount = pageBean.getTotalcount()/pageBean.getOnepagecount()+1;
		}
		pageBean.setPagecount(pagecount);
		pageBean.setList(findPart(pageBean.getBegin(),pageBean.getOnepagecount()));
		return pageBean;
	}

	public List<Customer> findlike(String cname) {
		return customerDao.findlike(cname);
		
	}

	public List<Customer> find(Customer customer1) {
		return customerDao.find(customer1);
	}


}
