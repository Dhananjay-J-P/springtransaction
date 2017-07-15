/**
 * 
 */
package aop;

/**
 * @author Dhananjay P
 *
 */
public class Dog {
	

	String name;
	
	int id;

	/**
	 * @param name
	 * @param id
	 */
	public Dog(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	

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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public void g() throws Exception
	{
		throw new Exception();
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "Pet [name=" + name + ", id=" + id + "]";
	}
	
	



	/**
	 * 
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
	}

}
