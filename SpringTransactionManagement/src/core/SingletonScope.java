/**
 * 
 */
package core;

/**
 * @author Dhananjay P
 *
 */
public abstract class SingletonScope {

	PrototypeScope proto;

	
	
	/**
	 * 
	 */
	public SingletonScope() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void perform() {
		System.out.println(getProto().getDate());
	}

	public abstract PrototypeScope getProto();

}
