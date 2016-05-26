package com.loskut.dao;

import com.loskut.dao.interfaces.GenericDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;


@Transactional
public abstract class AbstractDao<PK extends Serializable, T> implements GenericDao<PK, T> {
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T findById(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll(){
		Criteria criteria = createEntityCriteria().setCacheable(false).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return (List<T>) criteria.list();
	}

	@Override
	public void save(T entity) {
		getSession().persist(entity);
	}

	@Override
	public void update(T entity){
		getSession().update(entity);
	}

	@Override
	public void delete(T entity) {
		getSession().delete(entity);
	}

	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(persistentClass, persistentClass.getName());
	}

}
