package com.sort;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author:Wendy
 * @Date:2021/6/6 18:34
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class SortSpeedTest {
    public static int[] ARRAY_SIZE = {1000, 10000, 100000};

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SortSpeedTest.class);
        for (int i = 0; i < ARRAY_SIZE.length; i++) {
            testSort(ctx, ARRAY_SIZE[i]);
        }
    }

    private static void testSort(AnnotationConfigApplicationContext ctx, int i) {
        System.out.println("---------------------------------------");
        System.out.println("当前数组大小为" + i);
        Shell shell = ctx.getBean(Shell.class);
        System.out.println("希尔排序");
        System.out.println(shell.sort(AbstractSort.getRandomArray(i)));


        Insertion insertion = ctx.getBean(Insertion.class);
        System.out.println("插入排序");
        System.out.println(insertion.sort(AbstractSort.getRandomArray(i)));

        Quick quick = ctx.getBean(Quick.class);
        System.out.println("快速排序");
        System.out.println(quick.sort(AbstractSort.getRandomArray(i)));

        Bubble bubble = ctx.getBean(Bubble.class);
        System.out.println("冒泡排序");
        System.out.println(bubble.sort(AbstractSort.getRandomArray(i)));
    }
}
