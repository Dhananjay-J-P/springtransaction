/**
 * 
 */
package transaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dhananjay P
 *
 */
public class ORMTest {

	/**
	 * 
	 */

	public ORMTest() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "Spring_Transaction.xml" });
/*
		ORMService service = context.getBean(ORMService.class, "ormService");

		try {

			service.doTransaction("A111", "C999", 200);
		} catch (Exception e) {

		}
*/	
		
		ProgramaticService service = context.getBean(ProgramaticService.class, "programatic");

		try {

			service.doTransaction("C999", "A1121", 200);
		} catch (Exception e) {

		}
		
		
		context.registerShutdownHook();
	}
}
