package com.dao;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static org.hibernate.criterion.Example.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.domain.ComApprovalInStorage;

/**
 * A data access object (DAO) providing persistence and search support for
 * ComApprovalInStorage entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.domain.ComApprovalInStorage
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ComApprovalInStorageDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ComApprovalInStorageDAO.class);
	// property constants
	public static final String RESULT = "result";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(ComApprovalInStorage transientInstance) {
		log.debug("saving ComApprovalInStorage instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ComApprovalInStorage persistentInstance) {
		log.debug("deleting ComApprovalInStorage instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComApprovalInStorage findById(String id) {
		log.debug("getting ComApprovalInStorage instance with id: " + id);
		try {
			ComApprovalInStorage instance = (ComApprovalInStorage) getCurrentSession()
					.get("com.domain.ComApprovalInStorage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ComApprovalInStorage> findByExample(
			ComApprovalInStorage instance) {
		log.debug("finding ComApprovalInStorage instance by example");
		try {
			List<ComApprovalInStorage> results = (List<ComApprovalInStorage>) getCurrentSession()
					.createCriteria("com.domain.ComApprovalInStorage")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ComApprovalInStorage instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ComApprovalInStorage as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ComApprovalInStorage> findByResult(Object result) {
		return findByProperty(RESULT, result);
	}

	public List findAll() {
		log.debug("finding all ComApprovalInStorage instances");
		try {
			String queryString = "from ComApprovalInStorage";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ComApprovalInStorage merge(ComApprovalInStorage detachedInstance) {
		log.debug("merging ComApprovalInStorage instance");
		try {
			ComApprovalInStorage result = (ComApprovalInStorage) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ComApprovalInStorage instance) {
		log.debug("attaching dirty ComApprovalInStorage instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ComApprovalInStorage instance) {
		log.debug("attaching clean ComApprovalInStorage instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ComApprovalInStorageDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ComApprovalInStorageDAO) ctx.getBean("ComApprovalInStorageDAO");
	}
}