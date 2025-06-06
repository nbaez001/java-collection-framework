package com.empresa.proyecto.additional.lambda;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        Details in = Student::new;
        in.getStudent("Nerio");
    }
}

interface Details {
    public Student getStudent(String name);
}

class Student {
    Student(String name) {
        System.out.println(name + " is successfully enrolled");
    }
}
