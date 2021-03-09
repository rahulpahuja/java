package com.rahul.pahuja.day3;

public class Student {
    String name;
    float marks;

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }
}

class GenericClass<T> {

    T obj;

    public GenericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}


class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<Integer> iObj = new GenericClass<Integer>(15);
        System.out.println(iObj.getObj());

        GenericClass<String> sObj = new GenericClass<String>("Java");
        System.out.println(sObj.getObj());

        GenericClass<Student> tObj = new GenericClass<Student>(new Student("ABC", 15.5f));
        System.out.println(tObj.getObj());


    }
}