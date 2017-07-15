/**
 * 
 */
package transaction;

/**
 * @author Dhananjay P
 *
 */
public class ORMService {

	/**
	 * 
	 */
	public ORMService() {
		// TODO Auto-generated constructor stub
	}
	
	ORMDao dao;

	/**
	 * @return the dao
	 */
	public ORMDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(ORMDao dao) {
		this.dao = dao;
	}
	
	
	public void doTransaction(String fromaccount,String toaccount, double amount) throws Exception
	{
		dao.withdraw(fromaccount, amount);
		dao.deposit(toaccount, amount);
	}
}
