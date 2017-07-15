/**
 * 
 */
package transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author Dhananjay P
 *
 */
public class ORMDao {

	/**
	 * 
	 */
	public ORMDao() {
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
		Session session = sessionFactory.getCurrentSession();

		ORMAccount acc = (ORMAccount) session.get(ORMAccount.class, accountId);
		acc.setBalance(acc.getBalance() - amount);
		System.out.println("Amount withdrawn acc:"+accountId+"\tBalance:"+amount);
	}

	public void deposit(String accountId, double amount) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		ORMAccount acc = (ORMAccount) session.get(ORMAccount.class, accountId);
		acc.setBalance(acc.getBalance() + amount);
		System.out.println("Amount deposited acc:"+accountId+"\tBalance:"+amount);
		
	}
}
