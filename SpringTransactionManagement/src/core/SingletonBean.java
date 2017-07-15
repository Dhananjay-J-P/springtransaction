/**
 * 
 */
package core;

/**
 * @author Dhananjay P
 *
 */
public class SingletonBean {

	private static SingletonBean bean = null;

	public static SingletonBean getInstance() {
		if (bean == null) {
			bean = new SingletonBean();
		}
		return bean;
	}

}
