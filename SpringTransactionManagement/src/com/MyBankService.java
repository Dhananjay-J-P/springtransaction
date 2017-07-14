/**
 * 
 */
package com;

/**
 * @author Dhananjay P
 *
 */
public class MyBankService {

	/**
	 * 
	 */
	public MyBankService() {
		// TODO Auto-generated constructor stub
	}

	MyBankDao dao;

	/**
	 * @return the dao
	 */
	public MyBankDao getDao() {
		return dao;
	}

	/**
	 * @param dao
	 *            the dao to set
	 */
	public void setDao(MyBankDao dao) {
		this.dao = dao;
	}

	public void performTransaction(String from, String to, double amount) throws Exception {
		getDao().withdraw(from, amount);
		getDao().addTransactionEntry(from, amount, "Debit");
		getDao().deposit(to, amount);
		getDao().addTransactionEntry(to, amount, "Credit");
	}

}
