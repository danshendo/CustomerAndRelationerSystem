package cc.itcast.Dao;

import java.util.List;

import c.itcast.entity.Relationer;

public interface RelationerDao {

	List<Relationer> findAll();

	List<Relationer> delete(Integer id);

	List<Relationer> modify(Relationer relationer);

	List<Relationer> add(Relationer relationer);

	List<Relationer> find(Relationer relationer);

}
