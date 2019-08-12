package c.itcast.entity;

import java.util.Set;

public class Customer {
	private Integer cid;
	private String cname;
	private String phonenumber;
	private String address;
	private String level;
	private String resource;
	private Set<Relationer> setRelationer;
	private Set<Visit> setvisit;
	
	public Set<Visit> getSetvisit() {
		return setvisit;
	}
	public void setSetvisit(Set<Visit> setvisit) {
		this.setvisit = setvisit;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	
	public Set<Relationer> getSetRelationer() {
		return setRelationer;
	}
	public void setSetRelationer(Set<Relationer> setRelationer) {
		this.setRelationer = setRelationer;
	}

	
}
