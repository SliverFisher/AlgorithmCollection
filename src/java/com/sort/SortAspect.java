package com.sort;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author:Wendy
 * @Date:2021/6/6 18:10
 */
@Aspect
@Component
public class SortAspect {


    @Around(value = "execution(* com.sort.*.sort(int[]))")
    public Object getShellSortTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
        return "";
    }

}
