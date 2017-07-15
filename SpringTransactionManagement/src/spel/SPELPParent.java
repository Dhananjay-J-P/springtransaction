/**
 * 
 */
package spel;

/**
 * @author Dhananjay P
 *
 */
public class SPELPParent {

	/**
	 * 
	 */
	public SPELPParent() {
		// TODO Auto-generated constructor stub
	}
	
	String name;
	
	String address;

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SPELPParent [name=" + name + ", address=" + address + "]";
	}

	/**
	 * @param name
	 * @param address
	 */
	public SPELPParent(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	

}
