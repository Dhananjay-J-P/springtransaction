/**
 * 
 */
package core;

/**
 * @author Dhananjay P
 *
 */
public class ConstructorBasedDependencyInjection {

	public String name;

	private int age;

	/**
	 * 
	 */
	public ConstructorBasedDependencyInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public ConstructorBasedDependencyInjection(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Object initialized");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ConstructorBasedDependencyInjection [name=" + name + ", age=" + age + "]";
	}

}
