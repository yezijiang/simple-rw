package com.yaoyaohao.study.rw;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.PatternMatchUtils;

/**
 * 增加切面实现动态切数据源
 * NOTE: @Order(0) 此注解必须有，从而保证数据源切换在事务之前执行
 * 
 * @author liujianzhu
 * @date 2016年4月28日 下午2:26:29
 *
 */
@Aspect
@Component
@Order(-1)
public class DataSourceAspect {
	private final String[] READ_METHODS = {"query*","find*","select*"};
	
	@Pointcut("execution(* com.yaoyaohao.study.rw.service.*.*(..))")
	public void pointcut(){}
	
	@Before("pointcut()")
	public void before(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		if(PatternMatchUtils.simpleMatch(READ_METHODS, methodName)) {
			DataSourceTypeHolder.set(DataSourceType.READ);
			System.out.println("切换到读库");
		}
		else{
			DataSourceTypeHolder.reset();
			System.out.println("切换到写库");
		}
	}
}
