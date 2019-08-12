package c.itcast.entity;

import java.util.List;

public class PageBean {
	private Integer totalcount;//总记录数
	private Integer onepagecount;//每页记录数
	private Integer pagecount;//总页数
	private Integer cruentpage;//当前页
	private Integer begin;//起始位置
	private List<Customer> list;//当前页的客户列表
	public Integer getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}
	public Integer getOnepagecount() {
		return onepagecount;
	}
	public void setOnepagecount(Integer onepagecount) {
		this.onepagecount = onepagecount;
	}
	public Integer getPagecount() {
		return pagecount;
	}
	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}
	public Integer getCruentpage() {
		return cruentpage;
	}
	public void setCruentpage(Integer cruentpage) {
		this.cruentpage = cruentpage;
	}
	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	public List<Customer> getList() {
		return list;
	}
	public void setList(List<Customer> list) {
		this.list = list;
	}

	
}
