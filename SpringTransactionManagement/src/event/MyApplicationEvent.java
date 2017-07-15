/**
 * 
 */
package event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Dhananjay P
 *
 */
public class MyApplicationEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param source
	 */
	public MyApplicationEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

}
