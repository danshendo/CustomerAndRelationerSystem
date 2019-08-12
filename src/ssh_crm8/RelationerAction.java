package ssh_crm8;

import java.util.List;



import org.apache.struts2.ServletActionContext;

import c.itcast.entity.Customer;
import c.itcast.entity.Relationer;
import cc.itcast.service.CustomerService;
import cc.itcast.service.RelationerService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RelationerAction extends ActionSupport implements ModelDriven<Relationer> {
	private static final long serialVersionUID = 1L;
	private RelationerService relationerService;
	private List<Relationer> list;
	private Relationer relationer = new Relationer();
	private CustomerService customerService = new CustomerService();
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	public List<Relationer> getList() {
		return list;
	}
	public void setRelationerService(RelationerService relationerService) {
		this.relationerService = relationerService;
	}
	@Override
	public Relationer getModel() {
		return relationer;
	}
	public String findAll() {
		list = relationerService.findAll();
		return "findAll";
	}
	public String delete() {
		String rid = ServletActionContext.getRequest().getParameter("rid");
		Integer id = Integer.valueOf(rid);
		list = relationerService.delete(id);
		return "delete";
	}
	public String modify() {
		list = relationerService.modify(relationer);
		return "modify";
	}
	public String add() {
		list = relationerService.add(relationer);
		return "add";
	}
	public String findcustomer() {
		List<Customer> list1 = customerService.findAll();
		ServletActionContext.getRequest().setAttribute("list", list1);
		return "findrelationer";
	}
	public String findAllRelationer() {
		list = relationerService.find(relationer);
		return "findAllRelationer";
	}
}
