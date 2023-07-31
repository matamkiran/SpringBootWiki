package com.postgres.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/*@Aspect*/
public class CommonPointcut {

  @Pointcut("execution(* com.postgres.demo.repository.*.*(..))")
  public void anyDaoMethod() {}
}
