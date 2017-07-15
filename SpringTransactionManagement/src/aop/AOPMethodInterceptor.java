/**
 * 
 */
package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Dhananjay P
 *
 */
public class AOPMethodInterceptor implements MethodInterceptor {

	/**
	 * 
	 */
	public AOPMethodInterceptor() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.
	 * intercept.MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("AOP Method Invokation started\t" + invocation.getMethod().getName());
		Object result = invocation.proceed();
		System.out.println("AOP Method Invokation completed \t" + invocation.getMethod().getName());
		return result;
	}

}
