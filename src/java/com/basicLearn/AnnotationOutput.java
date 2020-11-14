package com.basicLearn;

@Annotations(value = "this is class", keys = "s", values = {"a", "b"})
public class AnnotationOutput {
    @Annotations(value = "this is method", keys = "s", values = {"a", "b"})
    public static String run() {
        System.out.println();
        return null;
    }
}
