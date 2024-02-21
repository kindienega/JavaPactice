package com.kindie;

public class Main {
    public static void main(String[] args) {
        int age = 40;
        int ageCopy = increment(age);
        System.out.println(age);
        System.out.println(ageCopy);
    }
    public static int increment(int age){
        return ++age;
    }
}