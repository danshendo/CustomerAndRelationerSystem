package ssh_crm8;
import java.util.List;



import org.apache.struts2.ServletActionContext;

import c.itcast.entity.Customer;
import c.itcast.entity.PageBean;
import cc.itcast.service.CustomerService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	private static final long serialVersionUID = 1L;
	private CustomerService customerService;
	private List<Customer> list;
	private Integer cruentpage;
	public void setCruentpage(Integer cruentpage) {
		this.cruentpage = cruentpage;
	}
	private Customer customer1 = new Customer();

	public Customer getModel() {
		return customer1;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	public List<Customer> getList() {
		return list;
	}
	public Integer getCruentpage() {
		return cruentpage;
	}
	public String  findAll() {
		list = customerService.findAll();
		return "list";
	}
	public String delete() {
		String id = ServletActionContext.getRequest().getParameter("cid");
		Customer customer = customerService.findById(id);
		list = customerService.delete(customer);
		return "delete";
	}
	public String modify() {
		Customer customer = getModel();
		System.out.println(customer);
		list = customerService.modify(customer);
		return "modify";
	}
	public String add() {
		List<Customer> culist = customerService.findAll();
		for (Customer customer : culist) {
			if(customer.getCid().equals(customer1.getCid())) {
				return "msg1";
		}
		}
		list = customerService.add(customer1);
		return "add";
	}
	public String pageBean() {
		PageBean pageBean = customerService.pageBean(cruentpage);
		ServletActionContext.getRequest().setAttribute("pageBean", pageBean);
		return "pageBean";
	}
	public String findlike() {
		String cname = ServletActionContext.getRequest().getParameter("cname");
		System.out.println(cname);
		list = customerService.findlike(cname);
		return "findlike";
	}
	public String find() {
		list = customerService.find(customer1);
		return "find";
	}
}
