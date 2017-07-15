/**
 * 
 */
package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Dhananjay P
 *
 */
public class AOPMethodBeforeAdvice implements MethodBeforeAdvice {

	/**
	 * 
	 */
	public AOPMethodBeforeAdvice() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.
	 * Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Advice Before executing " + method.getName());
	}
	
	

}
