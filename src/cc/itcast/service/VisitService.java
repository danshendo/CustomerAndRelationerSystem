package cc.itcast.service;

import java.util.List;

import javax.transaction.Transactional;

import c.itcast.entity.Visit;
import cc.itcast.Dao.VisitDao;
@Transactional
public class VisitService {
	private VisitDao visitDao;

	public void setVisitDao(VisitDao visitDao) {
		this.visitDao = visitDao;
	}

	public List<Visit> findAll() {
		return visitDao.findAll();
		
	}

	public Visit findById(Integer id) {
		return (Visit) visitDao.findById(id);
	}

	public void delete(Visit visit) {
		visitDao.delete(visit);
	}

	public void modify(Visit visit) {
		visitDao.modify(visit);
		
	}

	public void add(Visit visit) {
		visitDao.add(visit);
	}
}
