package com.ani.aop.xl;

import java.time.LocalDate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class XLReaderAspect {
    
    @Before("execution(* com.ani.aop.xl.XLReader.*(..))")
    public void printBeforeExecution(JoinPoint jp) {
        System.out.println("Method Executed At : "+LocalDate.now().toString());
    }

    @Pointcut("execution(* com.ani.aop.xl.XLReader.readAmountCell(..))")
    public void pointOfReadingAmountCell() {

    }

    @After("pointOfReadingAmountCell()")
    public void joinPointAfterReadingCell(JoinPoint jp) {
        System.out.println("Method " + jp.getSignature().getName() + " is about to be executed");
    }
}
