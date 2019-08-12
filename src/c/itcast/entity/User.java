package c.itcast.entity;

import java.util.Set;

public class User {
	private Integer uid;
	private String username;
	private String phonenumber;
	private String address;
	private Set<Visit> setvisit;
	
	public Set<Visit> getSetvisit() {
		return setvisit;
	}
	public void setSetvisit(Set<Visit> setvisit) {
		this.setvisit = setvisit;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
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

	
}
