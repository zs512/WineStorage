package com.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static org.hibernate.criterion.Example.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.domain.ComRight;

/**
 * A data access object (DAO) providing persistence and search support for
 * ComRight entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ComRight
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ComRightDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ComRightDAO.class);
	// property constants
	public static final String RIGHT_NAME = "rightName";
	public static final String DESCRIB = "describ";

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

	public void save(ComRight transientInstance) {
		log.debug("saving ComRight instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ComRight persistentInstance) {
		log.debug("deleting ComRight instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComRight findById(String id) {
		log.debug("getting ComRight instance with id: " + id);
		try {
			ComRight instance = (ComRight) getCurrentSession().get(
					"com.domain.ComRight", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ComRight> findByExample(ComRight instance) {
		log.debug("finding ComRight instance by example");
		try {
			List<ComRight> results = (List<ComRight>) getCurrentSession()
					.createCriteria("com.domain.ComRight")
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
		log.debug("finding ComRight instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ComRight as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ComRight> findByRightName(Object rightName) {
		return findByProperty(RIGHT_NAME, rightName);
	}

	public List<ComRight> findByDescrib(Object describ) {
		return findByProperty(DESCRIB, describ);
	}

	public List findAll() {
		log.debug("finding all ComRight instances");
		try {
			String queryString = "from ComRight";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ComRight merge(ComRight detachedInstance) {
		log.debug("merging ComRight instance");
		try {
			ComRight result = (ComRight) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ComRight instance) {
		log.debug("attaching dirty ComRight instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ComRight instance) {
		log.debug("attaching clean ComRight instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ComRightDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ComRightDAO) ctx.getBean("ComRightDAO");
	}
}