package com.rahul.pahuja.day2;


class Person {
    String name;
    float marks;

    public Person(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }
}

public class SwapTest4 {
    public static void swap(Object x, Object y) {
        Object t;
        t = x;
        x = y;
        y = t;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rahul", 99.9f);
        Person p2 = new Person("Ram", 92.9f);
        System.out.println(p1.getName() + "" + p2.getName());
        swap(p1, p2);
        System.out.println(p1.getName() + "" + p2.getName());

    }
}
