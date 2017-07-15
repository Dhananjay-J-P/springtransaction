/**
 * 
 */
package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author Dhananjay P
 *
 */
public class AOPAfterReturningAdvice implements AfterReturningAdvice {

	/**
	 * 
	 */
	public AOPAfterReturningAdvice() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Advice after returning executing " + method.getName());
	}

}
