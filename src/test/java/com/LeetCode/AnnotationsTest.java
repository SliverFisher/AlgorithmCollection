package com.LeetCode;

import com.basicLearn.Annotations;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author:Wendy
 * @Date:2020/11/14 15:27
 */
public class AnnotationsTest {
    @Test
    public void annotation_reflection_out_put() throws ClassNotFoundException, NoSuchMethodException {
        Class c = Class.forName("com.basicLearn.AnnotationOutput");
        Method method=c.getDeclaredMethod("run");
        Annotations annotations = (Annotations) c.getAnnotation(Annotations.class);
        Annotations annotations1 = (Annotations) method.getAnnotation(Annotations.class);
        assertThat(c.isAnnotationPresent(Annotations.class)).isEqualTo(true);
        assertThat(annotations.value()).isEqualTo("this is class");
        assertThat(annotations1.value()).isEqualTo("this is method");
        System.out.println(annotations.value());
        System.out.println(annotations1.value());
    }
}
