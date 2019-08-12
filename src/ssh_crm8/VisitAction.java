package ssh_crm8;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import c.itcast.entity.Customer;
import c.itcast.entity.User;
import c.itcast.entity.Visit;
import cc.itcast.service.CustomerService;
import cc.itcast.service.UserService;
import cc.itcast.service.VisitService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class VisitAction extends ActionSupport implements ModelDriven<Visit>{
	private static final long serialVersionUID = 1L;
	private VisitService visitService;
	private UserService userService;
	private CustomerService customerService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	private List<Visit> list;
	private Visit visit = new Visit();
	public List<Visit> getList() {
		return list;
	}
	public void setVisitService(VisitService visitService) {
		this.visitService = visitService;
	}
	@Override
	public Visit getModel() {
		return visit;
	}
	public String findAll() {
		list = visitService.findAll();
		return "findAll";
	}
	public String delete() {
		String iid = ServletActionContext.getRequest().getParameter("vid");
		Integer id = Integer.valueOf(iid);
		Visit visit1 = visitService.findById(id);
		visitService.delete(visit1);
		list = visitService.findAll();
		return "delete";
	}
	public String modify() {
		visitService.modify(visit);
		list = visitService.findAll();
		return "modify";
	}
	public String findall() {
		List<User> listuser = userService.findAll();
		List<Customer> listcustomer = customerService.findAll();
		String username = ServletActionContext.getRequest().getParameter("username");
		String cname = ServletActionContext.getRequest().getParameter("cname");
		String address = ServletActionContext.getRequest().getParameter("address");
		String content = ServletActionContext.getRequest().getParameter("content");
		ServletActionContext.getRequest().setAttribute("listuser",listuser);
		ServletActionContext.getRequest().setAttribute("listcustomer",listcustomer);
		ServletActionContext.getRequest().setAttribute("username",username);
		ServletActionContext.getRequest().setAttribute("cname",cname);
		ServletActionContext.getRequest().setAttribute("address",address);
		ServletActionContext.getRequest().setAttribute("content",content);
		return "findall";
	}
	public String FindAll() {
		List<User> listuser = userService.findAll();
		List<Customer> listcustomer = customerService.findAll();
		ServletActionContext.getRequest().setAttribute("listuser",listuser);
		ServletActionContext.getRequest().setAttribute("listcustomer",listcustomer);
		return "FindAll";
	}
	public String add() {
		visitService.add(visit);
		list = visitService.findAll();
		return "add";
	}
}
