/**
 * 
 */
package core;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import event.MyApplicationEventPublisher;

/**
 * @author Dhananjay P
 *
 */
public class CoreTester {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring.xml","Spring-prod.xml"});
		
		System.out.println( context.getBean("spelChild"));
		
		
		
		context.registerShutdownHook();
	}

}
