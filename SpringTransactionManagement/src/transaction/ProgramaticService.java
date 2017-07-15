/**
 * 
 */
package transaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author Dhananjay P
 *
 */
public class ProgramaticService {

	/**
	 * 
	 */

	TransactionTemplate template;

	/**
	 * @return the template
	 */
	public TransactionTemplate getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *            the template to set
	 */
	public void setTemplate(TransactionTemplate template) {
		this.template = template;
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

	public ProgramaticService() {
		// TODO Auto-generated constructor stub
	}

	public void doTransaction(String accountFrom, String accountTo, double amount) {
		
		
		template.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				try {
					dao.withdraw(accountFrom, amount);
					dao.deposit(accountTo, amount);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					arg0.setRollbackOnly();
				}
				
			}
		});

	}
}
