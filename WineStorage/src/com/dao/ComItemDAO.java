package com.dao;

import java.util.List;
import java.util.Set;

import com.common.Page;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static org.hibernate.criterion.Example.create;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.domain.ComItem;

/**
 * A data access object (DAO) providing persistence and search support for
 * ComItem entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see ComItem
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ComItemDAO {
	private static final Logger log = LoggerFactory.getLogger(ComItemDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String VARIETY = "variety";
	public static final String STANDARD = "standard";
	public static final String STORAGE = "storage";
	public static final String STATUS = "status";
	public static final String BARCODE = "barcode";

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

	public void save(ComItem transientInstance) {
		log.debug("saving ComItem instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ComItem persistentInstance) {
		log.debug("deleting ComItem instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComItem findById(String id) {
		log.debug("getting ComItem instance with id: " + id);
		try {
			ComItem instance = (ComItem) getCurrentSession().get(
					"com.domain.ComItem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ComItem> findByExample(ComItem instance) {
		log.debug("finding ComItem instance by example");
		try {
			List<ComItem> results = (List<ComItem>) getCurrentSession()
					.createCriteria("com.domain.ComItem").add(create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ComItem instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ComItem as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ComItem> findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List<ComItem> findByVariety(Object variety) {
		return findByProperty(VARIETY, variety);
	}

	public List<ComItem> findByStandard(Object standard) {
		return findByProperty(STANDARD, standard);
	}

	public List<ComItem> findByStorage(Object storage) {
		return findByProperty(STORAGE, storage);
	}

	public List<ComItem> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<ComItem> findByBarcode(Object barcode) {
		return findByProperty(BARCODE, barcode);
	}

	public List findAll() {
		log.debug("finding all ComItem instances");
		try {
			String queryString = "from ComItem";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ComItem merge(ComItem detachedInstance) {
		log.debug("merging ComItem instance");
		try {
			ComItem result = (ComItem) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ComItem instance) {
		log.debug("attaching dirty ComItem instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ComItem instance) {
		log.debug("attaching clean ComItem instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ComItemDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ComItemDAO) ctx.getBean("ComItemDAO");
	}

	public List<ComItem> findByPage(final int status, final Page page){
		log.debug("finding ComItem by Page");
		try{
			String queryString = "from ComItem as model where model." + STATUS + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, status);
			queryObject.setMaxResults(page.getEveryPage());
			queryObject.setFirstResult(page.getBeginIndex());
			return queryObject.list();
		}catch(RuntimeException re){
			log.error("finding ComItem by Page failed", re);
			throw re;
		}
	}
}