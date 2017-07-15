/**
 * 
 */
package event;

import org.springframework.context.ApplicationListener;

/**
 * @author Dhananjay P
 *
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

	/**
	 * 
	 */
	public MyApplicationListener() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	@Override
	public void onApplicationEvent(MyApplicationEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getSource());
	}

}
