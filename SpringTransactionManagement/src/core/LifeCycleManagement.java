/**
 * 
 */
package core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Dhananjay P
 *
 */
public class LifeCycleManagement implements InitializingBean, DisposableBean {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	String prop;
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LifeCycleManagement [prop=" + prop + "]";
	}

	/**
	 * @return the prop
	 */
	public String getProp() {
		return prop;
	}

	/**
	 * @param prop the prop to set
	 */
	public void setProp(String prop) {
		this.prop = prop;
	}

	public void init() {
		System.out.println("Custom init");
	}

	public void dest() {
		System.out.println("Custom destry");
	}

	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean destryoed");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Initialized");
	}

	/**
	 * 
	 */
	public LifeCycleManagement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
