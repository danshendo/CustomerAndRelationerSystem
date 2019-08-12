package cc.itcast.Dao;

import java.util.List;

import c.itcast.entity.Customer;

public interface CustomerDao {


	List<Customer> findAll();

	List<Customer> delete(Customer customer);

	Customer findById(String id);

	List<Customer> modify(Customer customer);

	List<Customer> add(Customer customer2);

	Integer findall();

	List<Customer> findPart(Integer begin, Integer onepagecount);

	List<Customer> findlike(String cname);

	List<Customer> find(Customer customer1);



}
