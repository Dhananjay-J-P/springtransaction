/**
 * 
 */
package core;

/**
 * @author Dhananjay P
 *
 */
public class Base {
	
	
	String name;
	
	int quantity;

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

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Base [name=" + name + ", quantity=" + quantity + "]";
	}

	/**
	 * @param name
	 * @param quantity
	 */
	public Base(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	/**
	 * 
	 */
	public Base() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
