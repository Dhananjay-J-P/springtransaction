/**
 * 
 */
package transaction;

/**
 * @author Dhananjay P
 *
 */
public class ORMAccount {

	/**
	 * 
	 */
	public ORMAccount() {
		// TODO Auto-generated constructor stub
	}
	
	String accountId;
	
	String name;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	double balance;

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
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @param accountId
	 * @param balance
	 */
	public ORMAccount(String accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ORMAccount [accountId=" + accountId + ", balance=" + balance + "]";
	}
	
	
	

}
