package com.company;

import com.company.exp.StudenteException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hi :!");
        Student s1 =new Student();
        try {
            s1.check();
        } catch (StudenteException e){
            e.printStackTrace();
        }
    }
}
