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

import com.domain.ComInStorage;

/**
 * A data access object (DAO) providing persistence and search support for
 * ComInStorage entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ComInStorage
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ComInStorageDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ComInStorageDAO.class);
	// property constants
	public static final String COUNT = "count";
	public static final String SUPPLY_PLACE = "supplyPlace";
	public static final String AGENT = "agent";
	public static final String STATUS = "status";
	public static final String REMARK = "remark";
	public static final String NATURE_STATUS = "natureStatus";

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

	public void save(ComInStorage transientInstance) {
		log.debug("saving ComInStorage instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ComInStorage persistentInstance) {
		log.debug("deleting ComInStorage instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComInStorage findById(String id) {
		log.debug("getting ComInStorage instance with id: " + id);
		try {
			ComInStorage instance = (ComInStorage) getCurrentSession().get(
					"com.domain.ComInStorage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ComInStorage> findByExample(ComInStorage instance) {
		log.debug("finding ComInStorage instance by example");
		try {
			List<ComInStorage> results = (List<ComInStorage>) getCurrentSession()
					.createCriteria("com.domain.ComInStorage")
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
		log.debug("finding ComInStorage instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ComInStorage as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ComInStorage> findByCount(Object count) {
		return findByProperty(COUNT, count);
	}

	public List<ComInStorage> findBySupplyPlace(Object supplyPlace) {
		return findByProperty(SUPPLY_PLACE, supplyPlace);
	}

	public List<ComInStorage> findByAgent(Object agent) {
		return findByProperty(AGENT, agent);
	}

	public List<ComInStorage> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<ComInStorage> findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List<ComInStorage> findByNatureStatus(Object natureStatus) {
		return findByProperty(NATURE_STATUS, natureStatus);
	}

	public List findAll() {
		log.debug("finding all ComInStorage instances");
		try {
			String queryString = "from ComInStorage";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ComInStorage merge(ComInStorage detachedInstance) {
		log.debug("merging ComInStorage instance");
		try {
			ComInStorage result = (ComInStorage) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ComInStorage instance) {
		log.debug("attaching dirty ComInStorage instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ComInStorage instance) {
		log.debug("attaching clean ComInStorage instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ComInStorageDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ComInStorageDAO) ctx.getBean("ComInStorageDAO");
	}
}