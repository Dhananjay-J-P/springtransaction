/**
 * 
 */
package aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author Dhananjay P
 *
 */
public class AOPThrowsAdvice implements ThrowsAdvice {

	/**
	 * 
	 */
	public AOPThrowsAdvice() {
		// TODO Auto-generated constructor stub
	}

	public void afterThrowing(Exception e) {
		System.out.println("AOP exception is thrown");
	}
}
