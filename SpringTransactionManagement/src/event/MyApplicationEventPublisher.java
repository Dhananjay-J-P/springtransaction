/**
 * 
 */
package event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author Dhananjay P
 *
 */
public class MyApplicationEventPublisher implements ApplicationEventPublisherAware {

	/**
	 * 
	 */
	public MyApplicationEventPublisher() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationEventPublisherAware#
	 * setApplicationEventPublisher(org.springframework.context.
	 * ApplicationEventPublisher)
	 */
	ApplicationEventPublisher arg0;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub
		this.arg0 = arg0;
	}

	public void publish() {
		arg0.publishEvent(new MyApplicationEvent("This is my Event"));
	}

	
	
	
}
