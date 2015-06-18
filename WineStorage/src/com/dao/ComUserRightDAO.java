package com.dao;

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

import com.domain.ComUserRight;

/**
 * A data access object (DAO) providing persistence and search support for
 * ComUserRight entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see ComUserRight
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ComUserRightDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ComUserRightDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String RIGHT_ID = "rightId";
	public static final String STATUS = "status";

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

	public void save(ComUserRight transientInstance) {
		log.debug("saving ComUserRight instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ComUserRight persistentInstance) {
		log.debug("deleting ComUserRight instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComUserRight findById(String id) {
		log.debug("getting ComUserRight instance with id: " + id);
		try {
			ComUserRight instance = (ComUserRight) getCurrentSession().get(
					"com.domain.ComUserRight", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ComUserRight> findByExample(ComUserRight instance) {
		log.debug("finding ComUserRight instance by example");
		try {
			List<ComUserRight> results = (List<ComUserRight>) getCurrentSession()
					.createCriteria("com.domain.ComUserRight")
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
		log.debug("finding ComUserRight instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ComUserRight as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ComUserRight> findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List<ComUserRight> findByRightId(Object rightId) {
		return findByProperty(RIGHT_ID, rightId);
	}

	public List<ComUserRight> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all ComUserRight instances");
		try {
			String queryString = "from ComUserRight";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ComUserRight merge(ComUserRight detachedInstance) {
		log.debug("merging ComUserRight instance");
		try {
			ComUserRight result = (ComUserRight) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ComUserRight instance) {
		log.debug("attaching dirty ComUserRight instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ComUserRight instance) {
		log.debug("attaching clean ComUserRight instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ComUserRightDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (ComUserRightDAO) ctx.getBean("ComUserRightDAO");
	}
}