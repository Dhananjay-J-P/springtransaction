/**
 * 
 */
package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author Dhananjay P
 *
 */
public class MyBankDao {

	/**
	 * 
	 */
	public MyBankDao() {
		// TODO Auto-generated constructor stub
	}

	SessionFactory sessionFactory;

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void withdraw(String accountId, double amount) throws Exception {

		Session session = getSessionFactory().getCurrentSession();

		MyAccount a = (MyAccount) session.get(MyAccount.class, accountId);
		a.setBalance(a.getBalance() - amount);
		session.update(a);
	}

	public void deposit(String accountId, double amount) throws Exception {

		Session session = getSessionFactory().getCurrentSession();

		MyAccount a = (MyAccount) session.get(MyAccount.class, accountId);
		a.setBalance(a.getBalance() + amount);
		session.update(a);
	}

	public void addTransactionEntry(String accountId, double amount, String type) {

		Session session = getSessionFactory().getCurrentSession();
		Transaction a = new Transaction(accountId, type, amount);
		session.save(a);

	}

}
