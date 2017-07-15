/**
 * 
 */
package aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dhananjay P
 *
 */
public class AOPTester {

	/**
	 * 
	 */
	public AOPTester() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring_AOP.xml" });

		Pet p = (Pet) context.getBean("pet");
		System.out.println(p.getId());
		System.out.println(p.getName());

		Dog d = (Dog) context.getBean("dog");
		System.out.println(d.getId());
		System.out.println(d.getName());

		context.registerShutdownHook();

	}

}
