package cc.itcast.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import c.itcast.entity.Relationer;
import cc.itcast.Dao.RelationerDao;

@Transactional
public class RelationerService {
	private RelationerDao relationerDao;

	public void setRelationerDao(RelationerDao relationerDao) {
		this.relationerDao = relationerDao;
	}

	public List<Relationer> findAll() {
		return relationerDao.findAll();
	}

	public List<Relationer> delete(Integer id) {
		return relationerDao.delete(id);		
	}

	public List<Relationer> modify(Relationer relationer) {
		return relationerDao.modify(relationer);
	}

	public List<Relationer> add(Relationer relationer) {
		return relationerDao.add(relationer);
	}

	public List<Relationer> find(Relationer relationer) {
		return relationerDao.find(relationer);
	}
}
