/**
 * 
 */
package com;

/**
 * @author Dhananjay P
 *
 */
public class Transaction {

	/**
	 * 
	 */
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	long transactionId;
	
	
	/**
	 * @return the transactionId
	 */
	public long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	String accountId;
	
	String type;
	
	double amount;

	/**
	 * @return the transationId
	 */
	

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @param accountId
	 * @param type
	 * @param amount
	 */
	public Transaction(String accountId, String type, double amount) {
		this.accountId = accountId;
		this.type = type;
		this.amount = amount;
	}
	
	
	
}
