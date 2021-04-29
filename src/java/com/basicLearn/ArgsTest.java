package com.basicLearn;

/**
 * 方法得到的是对象引用的拷贝，对象引用及其他的拷贝同时引用同一个对象
 *
 * 一个方法不能修改一个基本数据类型的参数（即数值型或布尔型）。
 * 一个方法可以改变一个对象参数的状态。
 * 一个方法不能让对象参数引用一个新的对象。
 */
public class ArgsTest {
    public static void main(String[] args) {
        Student student = new Student("李四");
        change(student);
        System.out.println(student.name);
    }

    private static void change(Student student) {
        student = new Student("张三");
    }
}

class Student {
    public String name = "";

    public Student(String name) {
        this.name = name;
    }
}
