package ssh_crm8;

import org.apache.struts2.ServletActionContext;

import c.itcast.entity.User;
import cc.itcast.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private String username;
	private String phonenumber;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String Login() {
		User user = new User();
		user.setAddress(address);
		user.setPhonenumber(phonenumber);
		user.setUsername(username);
		User userexist = userService.login(user);
		if(userexist != null) {
			ServletActionContext.getRequest().getSession().setAttribute("user",userexist);
			return "logincheng";
		}else{
			return "login";
		}
	}
	public String regist() {
		User user = new User();
		user.setAddress(address);
		user.setPhonenumber(phonenumber);
		user.setUsername(username);
		System.out.println(user);
		userService.regist(user);
		return "address";
	}
	public String tuichu() {
		ServletActionContext.getRequest().getSession().invalidate();
		return "tuichu";
	}
}
