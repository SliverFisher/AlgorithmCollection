package com.basicLearn;

/**
 * @Author:Wendy
 * @Date:2020/11/14 11:00
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解的注解，叫元注解
 * 若是标注注解的某个属性没有取名字，表示，该属性名为value
 * 若是数组中只有一个元素，大括号可以省略
 *
 * @Target表示，能用上注解的地方，如方法，类，局部变量
 * @Retention表示注解作用范围，如runtime，运行时，source保存在代码中，class表示保存在.class文件中
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
public @interface Annotations {
    String value() default "s";

    String[] keys();

    String[] values();
}

