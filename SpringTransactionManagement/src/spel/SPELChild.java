/**
 * 
 */
package spel;

/**
 * @author Dhananjay P
 *
 */
public class SPELChild {

	/**
	 * 
	 */
	public SPELChild() {
		// TODO Auto-generated constructor stub
	}

	
	int age;
	
	String address;

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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

	/**
	 * @param age
	 * @param address
	 */
	public SPELChild(int age, String address) {
		this.age = age;
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SPELChild [age=" + age + ", address=" + address + "]";
	}
	
	
}
