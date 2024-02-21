package com.kindie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.println("hello");
        }
        String[] names = {"alex","alula","aleeeex","alfeeeula","alfkkfkfkkfex","aluffffla","aledcfddedx","alusddla"} ;
        for (int i = 0; i<names.length; i++){
            System.out.println(names[i] + " -------------> ass its index "+  i);
        }
        for(String name : names){
            System.out.println(name);
        }

        int age = 40;
        int ageCopy = increment(age);
        System.out.println(age);
        System.out.println(ageCopy);
    }
    public static int increment(int age){
        return ++age;
    }
}