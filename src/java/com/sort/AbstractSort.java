package com.sort;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public interface AbstractSort {
    static int[] PHONE_NUMBER = new int[]{1, 5, 6, 7, 5, 1, 0, 3, 1, 4, 4};
    static int[] BIG_ARRAY = getRandomArray(new int[99999]);
    static int[] array2 = new int[]{1, 2, 4, 55, 66, 77, 0, 3, 23, 42, 765};

    @Pointcut(value = "execution(* com.sort.*(..))")
    String sort(int[] array);

    public static int[] getRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }

    @Pointcut(value = "execution(* com.sort.Shell.sort)")
    default void printSortTime() {
        System.out.println("??????");
    }

    @After(value = "sort(int[])")
    default void aspectAfter(JoinPoint joinPoint) {
        System.out.println("【后置通知】");
        System.out.println("\tkind=" + joinPoint.getKind());
    }

}
