package com.empresa.proyecto.additional.lambda;

public class LambdaExample3 {
    public static void main(String[] args) {
        MyFunInterface2 in = (text) -> text.length();
        int len = in.findLength("Lambda");
        System.out.println("Length of the given String is: " + len);
    }
}

interface MyFunInterface2 {
    public int findLength(String s);
}


