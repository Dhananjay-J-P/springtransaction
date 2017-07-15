/**
 * 
 */
package spel;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author Dhananjay P
 *
 */
public class SPELParser {

	/**
	 * 
	 */
	public SPELParser() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "Spring.xml", "Spring-prod.xml" });

		ExpressionParser parser = new SpelExpressionParser();

		
		System.out.println(parser.parseExpression("a").getValue(new A(1,"Jack")));

		context.registerShutdownHook();

	}

}

class A
{
	int a;
	String name;
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
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
	 * @param a
	 * @param name
	 */
	public A(int a, String name) {
		this.a = a;
		this.name = name;
	}
	
	
}
