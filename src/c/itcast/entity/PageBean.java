package c.itcast.entity;

import java.util.List;

public class PageBean {
	private Integer totalcount;//�ܼ�¼��
	private Integer onepagecount;//ÿҳ��¼��
	private Integer pagecount;//��ҳ��
	private Integer cruentpage;//��ǰҳ
	private Integer begin;//��ʼλ��
	private List<Customer> list;//��ǰҳ�Ŀͻ��б�
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
